package com.example.jingbin.designpattern.app;

import android.graphics.Color;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

import org.xml.sax.XMLReader;

/**
 * Created by yangcai on 16/10/24.
 * 将<em></em>标签里的文字变色
 * 朋友所写,自己也写过,不过没有这么规范,就此借鉴过来~
 */

public class EMTagHandler implements Html.TagHandler {

    private static final String EM_TAG = "em";
    private static final String EM_TAG_START = getStartTag(EM_TAG);
    private static final String EM_TAG_END = getStartend(EM_TAG);

    private static final String EM_TAG_EXT = "em_ext";
    private static final String EM_TAG_EXT_START = getStartTag(EM_TAG_EXT);
    private static final String EM_TAG_EXT_END = getStartend(EM_TAG_EXT);

    private static final String HTML_TAG = "html";
    private static final String HTML_TAG_START = getStartTag(HTML_TAG);
    private static final String HTML_TAG_END = getStartend(EM_TAG_EXT);

    private static final String BODY_TAG = "body";
    private static final String BODY_TAG_START = getStartTag(BODY_TAG);
    private static final String BODY_TAG_END = getStartend(EM_TAG_EXT);


    private static String getStartTag(String tag) {
        return "<" + tag + ">";
    }

    private static String getStartend(String tag) {
        return "</" + tag + ">";
    }

    public static Spanned fromHtml(String text) {
        text = text.replaceAll(EM_TAG_START, EM_TAG_EXT_START);
        text = text.replaceAll(EM_TAG_END, EM_TAG_EXT_END);
        if (!text.contains(HTML_TAG_START)) {
            text = HTML_TAG_START + BODY_TAG_START + text + BODY_TAG_END + HTML_TAG_END;
        }
        return Html.fromHtml(text, null, new EMTagHandler());
    }

    @Override
    public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
        if (opening) {
            handStartTag(tag, output);
        } else {
            handStartEnd(tag, output);
        }
    }

    private static void handStartTag(String tag, Editable text) {
        if (tag.toLowerCase().equals(EM_TAG_EXT)) {
            start(text, new EM());
        }
    }


    private static void handStartEnd(String tag, Editable text) {
        if (tag.toLowerCase().equals(EM_TAG_EXT)) {
            end(text, EM.class, new ForegroundColorSpan(Color.parseColor("#22c283")));
        }
    }

    private static void start(Editable text, Object mark) {
        int len = text.length();
        text.setSpan(mark, len, len, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
    }

    private static void end(Editable text, Class kind, Object repl) {
        Object obj = getLast(text, kind);
        if (obj != null) {
            setSpanFromMark(text, obj, repl);
        }
    }

    public static class EM {
    }

    private static void setSpanFromMark(Spannable text, Object mark, Object... spans) {
        int where = text.getSpanStart(mark);
        text.removeSpan(mark);
        int len = text.length();
        if (where != len) {
            for (Object span : spans) {
                text.setSpan(span, where, len, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
    }

    private static <T> T getLast(Spanned text, Class<T> kind) {
        T[] objs = text.getSpans(0, text.length(), kind);

        if (objs.length == 0) {
            return null;
        } else {
            return objs[objs.length - 1];
        }
    }
}
