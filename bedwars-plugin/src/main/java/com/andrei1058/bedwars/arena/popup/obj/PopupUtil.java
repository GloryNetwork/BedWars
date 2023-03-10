package com.andrei1058.bedwars.arena.popup.obj;

import java.util.ArrayList;
import java.util.List;

public class PopupUtil {

    public static List<String> getNorthLocations() {
        List<String> relloc = new ArrayList<>();
        relloc.add("-1, 0, -2");
        relloc.add("-2, 0, -1");
        relloc.add("-2, 0, 0");
        relloc.add("-1, 0, 1");
        relloc.add("0, 0, 1");
        relloc.add("1, 0, 1");
        relloc.add("2, 0, 0");
        relloc.add("2, 0, -1");
        relloc.add("1, 0, -2");
        relloc.add("0, 0, 0, ladder2");
        relloc.add("-1, 1, -2");
        relloc.add("-2, 1, -1");
        relloc.add("-2, 1, 0");
        relloc.add("-1, 1, 1");
        relloc.add("0, 1, 1");
        relloc.add("1, 1, 1");
        relloc.add("2, 1, 0");
        relloc.add("2, 1, -1");
        relloc.add("1, 1, -2");
        relloc.add("0, 1, 0, ladder2");
        relloc.add("-1, 2, -2");
        relloc.add("-2, 2, -1");
        relloc.add("-2, 2, 0");
        relloc.add("-1, 2, 1");
        relloc.add("0, 2, 1");
        relloc.add("1, 2, 1");
        relloc.add("2, 2, 0");
        relloc.add("2, 2, -1");
        relloc.add("1, 2, -2");
        relloc.add("0, 2, 0, ladder2");
        relloc.add("0, 3, -2");
        relloc.add("-1, 3, -2");
        relloc.add("-2, 3, -1");
        relloc.add("-2, 3, 0");
        relloc.add("-1, 3, 1");
        relloc.add("0, 3, 1");
        relloc.add("1, 3, 1");
        relloc.add("2, 3, 0");
        relloc.add("2, 3, -1");
        relloc.add("1, 3, -2");
        relloc.add("0, 3, 0, ladder2");
        relloc.add("0, 4, -2");
        relloc.add("-1, 4, -2");
        relloc.add("-2, 4, -1");
        relloc.add("-2, 4, 0");
        relloc.add("-1, 4, 1");
        relloc.add("0, 4, 1");
        relloc.add("1, 4, 1");
        relloc.add("2, 4, 0");
        relloc.add("2, 4, -1");
        relloc.add("1, 4, -2");
        relloc.add("0, 4, 0, ladder2");
        relloc.add("-2, 5, 1");
        relloc.add("-2, 5, 0");
        relloc.add("-2, 5, -1");
        relloc.add("-2, 5, -2");
        relloc.add("-1, 5, 1");
        relloc.add("-1, 5, 0");
        relloc.add("-1, 5, -1");
        relloc.add("-1, 5, -2");
        relloc.add("0, 5, 1");
        relloc.add("0, 5, -1");
        relloc.add("0, 5, -2");
        relloc.add("1, 5, 1");
        relloc.add("0, 5, 0, ladder2");
        relloc.add("1, 5, 0");
        relloc.add("1, 5, -1");
        relloc.add("1, 5, -2");
        relloc.add("2, 5, 1");
        relloc.add("2, 5, 0");
        relloc.add("2, 5, -1");
        relloc.add("2, 5, -2");
        relloc.add("-3, 5, -2");
        relloc.add("-3, 6, -2");
        relloc.add("-3, 7, -2");
        relloc.add("-3, 6, -1");
        relloc.add("-3, 6, 0");
        relloc.add("-3, 5, 1");
        relloc.add("-3, 6, 1");
        relloc.add("-3, 7, 1");
        relloc.add("-2, 5, 2");
        relloc.add("-2, 6, 2");
        relloc.add("-2, 7, 2");
        relloc.add("-1, 6, 2");
        relloc.add("0, 5, 2");
        relloc.add("0, 6, 2");
        relloc.add("0, 7, 2");
        relloc.add("1, 6, 2");
        relloc.add("2, 5, 2");
        relloc.add("2, 6, 2");
        relloc.add("2, 7, 2");
        relloc.add("3, 5, -2");
        relloc.add("3, 6, -2");
        relloc.add("3, 7, -2");
        relloc.add("3, 6, -1");
        relloc.add("3, 6, 0");
        relloc.add("3, 5, 1");
        relloc.add("3, 6, 1");
        relloc.add("3, 7, 1");
        relloc.add("-2, 5, -3");
        relloc.add("-2, 6, -3");
        relloc.add("-2, 7, -3");
        relloc.add("-1, 6, -3");
        relloc.add("0, 5, -3");
        relloc.add("0, 6, -3");
        relloc.add("0, 7, -3");
        relloc.add("1, 6, -3");
        relloc.add("2, 5, -3");
        relloc.add("2, 6, -3");
        relloc.add("2, 7, -3");
        return relloc;
    }

    public static List<String> getSouthLocations() {
        List<String> relloc = new ArrayList<>();
        relloc.add("1, 0, 2");
        relloc.add("2, 0, 1");
        relloc.add("2, 0, 0");
        relloc.add("1, 0, -1");
        relloc.add("0, 0, -1");
        relloc.add("-1, 0, -1");
        relloc.add("-2, 0, 0");
        relloc.add("-2, 0, 1");
        relloc.add("-1, 0, 2");
        relloc.add("0, 0, 0, ladder3");
        relloc.add("1, 1, 2");
        relloc.add("2, 1, 1");
        relloc.add("2, 1, 0");
        relloc.add("1, 1, -1");
        relloc.add("0, 1, -1");
        relloc.add("-1, 1, -1");
        relloc.add("-2, 1, 0");
        relloc.add("-2, 1, 1");
        relloc.add("-1, 1, 2");
        relloc.add("0, 1, 0, ladder3");
        relloc.add("1, 2, 2");
        relloc.add("2, 2, 1");
        relloc.add("2, 2, 0");
        relloc.add("1, 2, -1");
        relloc.add("0, 2, -1");
        relloc.add("-1, 2, -1");
        relloc.add("-2, 2, 0");
        relloc.add("-2, 2, 1");
        relloc.add("-1, 2, 2");
        relloc.add("0, 2, 0, ladder3");
        relloc.add("0, 3, 2");
        relloc.add("1, 3, 2");
        relloc.add("2, 3, 1");
        relloc.add("2, 3, 0");
        relloc.add("1, 3, -1");
        relloc.add("0, 3, -1");
        relloc.add("-1, 3, -1");
        relloc.add("-2, 3, 0");
        relloc.add("-2, 3, 1");
        relloc.add("-1, 3, 2");
        relloc.add("0, 3, 0, ladder3");
        relloc.add("0, 4, 2");
        relloc.add("1, 4, 2");
        relloc.add("2, 4, 1");
        relloc.add("2, 4, 0");
        relloc.add("1, 4, -1");
        relloc.add("0, 4, -1");
        relloc.add("-1, 4, -1");
        relloc.add("-2, 4, 0");
        relloc.add("-2, 4, 1");
        relloc.add("-1, 4, 2");
        relloc.add("0, 4, 0, ladder3");
        relloc.add("2, 5, -1");
        relloc.add("2, 5, 0");
        relloc.add("2, 5, 1");
        relloc.add("2, 5, 2");
        relloc.add("1, 5, -1");
        relloc.add("1, 5, 0");
        relloc.add("1, 5, 1");
        relloc.add("1, 5, 2");
        relloc.add("0, 5, -1");
        relloc.add("0, 5, 1");
        relloc.add("0, 5, 2");
        relloc.add("-1, 5, -1");
        relloc.add("0, 5, 0, ladder3");
        relloc.add("-1, 5, 0");
        relloc.add("-1, 5, 1");
        relloc.add("-1, 5, 2");
        relloc.add("-2, 5, -1");
        relloc.add("-2, 5, 0");
        relloc.add("-2, 5, 1");
        relloc.add("-2, 5, 2");
        relloc.add("3, 5, 2");
        relloc.add("3, 6, 2");
        relloc.add("3, 7, 2");
        relloc.add("3, 6, 1");
        relloc.add("3, 6, 0");
        relloc.add("3, 5, -1");
        relloc.add("3, 6, -1");
        relloc.add("3, 7, -1");
        relloc.add("2, 5, -2");
        relloc.add("2, 6, -2");
        relloc.add("2, 7, -2");
        relloc.add("1, 6, -2");
        relloc.add("0, 5, -2");
        relloc.add("0, 6, -2");
        relloc.add("0, 7, -2");
        relloc.add("-1, 6, -2");
        relloc.add("-2, 5, -2");
        relloc.add("-2, 6, -2");
        relloc.add("-2, 7, -2");
        relloc.add("-3, 5, 2");
        relloc.add("-3, 6, 2");
        relloc.add("-3, 7, 2");
        relloc.add("-3, 6, 1");
        relloc.add("-3, 6, 0");
        relloc.add("-3, 5, -1");
        relloc.add("-3, 6, -1");
        relloc.add("-3, 7, -1");
        relloc.add("2, 5, 3");
        relloc.add("2, 6, 3");
        relloc.add("2, 7, 3");
        relloc.add("1, 6, 3");
        relloc.add("0, 5, 3");
        relloc.add("0, 6, 3");
        relloc.add("0, 7, 3");
        relloc.add("-1, 6, 3");
        relloc.add("-2, 5, 3");
        relloc.add("-2, 6, 3");
        relloc.add("-2, 7, 3");
        return relloc;
    }

    public static List<String> getEastLocations() {
        List<String> relloc = new ArrayList<>();
        relloc.add("2, 0, -1");
        relloc.add("1, 0, -2");
        relloc.add("0, 0, -2");
        relloc.add("-1, 0, -1");
        relloc.add("-1, 0, 0");
        relloc.add("-1, 0, 1");
        relloc.add("0, 0, 2");
        relloc.add("1, 0, 2");
        relloc.add("2, 0, 1");
        relloc.add("0, 0, 0, ladder5");
        relloc.add("2, 1, -1");
        relloc.add("1, 1, -2");
        relloc.add("0, 1, -2");
        relloc.add("-1, 1, -1");
        relloc.add("-1, 1, 0");
        relloc.add("-1, 1, 1");
        relloc.add("0, 1, 2");
        relloc.add("1, 1, 2");
        relloc.add("2, 1, 1");
        relloc.add("0, 1, 0, ladder5");
        relloc.add("2, 2, -1");
        relloc.add("1, 2, -2");
        relloc.add("0, 2, -2");
        relloc.add("-1, 2, -1");
        relloc.add("-1, 2, 0");
        relloc.add("-1, 2, 1");
        relloc.add("0, 2, 2");
        relloc.add("1, 2, 2");
        relloc.add("2, 2, 1");
        relloc.add("0, 2, 0, ladder5");
        relloc.add("2, 3, 0");
        relloc.add("2, 3, -1");
        relloc.add("1, 3, -2");
        relloc.add("0, 3, -2");
        relloc.add("-1, 3, -1");
        relloc.add("-1, 3, 0");
        relloc.add("-1, 3, 1");
        relloc.add("0, 3, 2");
        relloc.add("1, 3, 2");
        relloc.add("2, 3, 1");
        relloc.add("0, 3, 0, ladder5");
        relloc.add("2, 4, 0");
        relloc.add("2, 4, -1");
        relloc.add("1, 4, -2");
        relloc.add("0, 4, -2");
        relloc.add("-1, 4, -1");
        relloc.add("-1, 4, 0");
        relloc.add("-1, 4, 1");
        relloc.add("0, 4, 2");
        relloc.add("1, 4, 2");
        relloc.add("2, 4, 1");
        relloc.add("0, 4, 0, ladder5");
        relloc.add("-1, 5, -2");
        relloc.add("0, 5, -2");
        relloc.add("1, 5, -2");
        relloc.add("2, 5, -2");
        relloc.add("-1, 5, -1");
        relloc.add("0, 5, -1");
        relloc.add("1, 5, -1");
        relloc.add("2, 5, -1");
        relloc.add("-1, 5, 0");
        relloc.add("1, 5, 0");
        relloc.add("2, 5, 0");
        relloc.add("-1, 5, 1");
        relloc.add("0, 5, 0, ladder5");
        relloc.add("0, 5, 1");
        relloc.add("1, 5, 1");
        relloc.add("2, 5, 1");
        relloc.add("-1, 5, 2");
        relloc.add("0, 5, 2");
        relloc.add("1, 5, 2");
        relloc.add("2, 5, 2");
        relloc.add("2, 5, -3");
        relloc.add("2, 6, -3");
        relloc.add("2, 7, -3");
        relloc.add("1, 6, -3");
        relloc.add("0, 6, -3");
        relloc.add("-1, 5, -3");
        relloc.add("-1, 6, -3");
        relloc.add("-1, 7, -3");
        relloc.add("-2, 5, -2");
        relloc.add("-2, 6, -2");
        relloc.add("-2, 7, -2");
        relloc.add("-2, 6, -1");
        relloc.add("-2, 5, 0");
        relloc.add("-2, 6, 0");
        relloc.add("-2, 7, 0");
        relloc.add("-2, 6, 1");
        relloc.add("-2, 5, 2");
        relloc.add("-2, 6, 2");
        relloc.add("-2, 7, 2");
        relloc.add("2, 5, 3");
        relloc.add("2, 6, 3");
        relloc.add("2, 7, 3");
        relloc.add("1, 6, 3");
        relloc.add("0, 6, 3");
        relloc.add("-1, 5, 3");
        relloc.add("-1, 6, 3");
        relloc.add("-1, 7, 3");
        relloc.add("3, 5, -2");
        relloc.add("3, 6, -2");
        relloc.add("3, 7, -2");
        relloc.add("3, 6, -1");
        relloc.add("3, 5, 0");
        relloc.add("3, 6, 0");
        relloc.add("3, 7, 0");
        relloc.add("3, 6, 1");
        relloc.add("3, 5, 2");
        relloc.add("3, 6, 2");
        relloc.add("3, 7, 2");
        return relloc;
    }

    public static List<String> getWestLocations() {
        List<String> relloc = new ArrayList<>();
        relloc.add("-2, 0, 1");
        relloc.add("-1, 0, 2");
        relloc.add("0, 0, 2");
        relloc.add("1, 0, 1");
        relloc.add("1, 0, 0");
        relloc.add("1, 0, -1");
        relloc.add("0, 0, -2");
        relloc.add("-1, 0, -2");
        relloc.add("-2, 0, -1");
        relloc.add("0, 0, 0, ladder4");
        relloc.add("-2, 1, 1");
        relloc.add("-1, 1, 2");
        relloc.add("0, 1, 2");
        relloc.add("1, 1, 1");
        relloc.add("1, 1, 0");
        relloc.add("1, 1, -1");
        relloc.add("0, 1, -2");
        relloc.add("-1, 1, -2");
        relloc.add("-2, 1, -1");
        relloc.add("0, 1, 0, ladder4");
        relloc.add("-2, 2, 1");
        relloc.add("-1, 2, 2");
        relloc.add("0, 2, 2");
        relloc.add("1, 2, 1");
        relloc.add("1, 2, 0");
        relloc.add("1, 2, -1");
        relloc.add("0, 2, -2");
        relloc.add("-1, 2, -2");
        relloc.add("-2, 2, -1");
        relloc.add("0, 2, 0, ladder4");
        relloc.add("-2, 3, 0");
        relloc.add("-2, 3, 1");
        relloc.add("-1, 3, 2");
        relloc.add("0, 3, 2");
        relloc.add("1, 3, 1");
        relloc.add("1, 3, 0");
        relloc.add("1, 3, -1");
        relloc.add("0, 3, -2");
        relloc.add("-1, 3, -2");
        relloc.add("-2, 3, -1");
        relloc.add("0, 3, 0, ladder4");
        relloc.add("-2, 4, 0");
        relloc.add("-2, 4, 1");
        relloc.add("-1, 4, 2");
        relloc.add("0, 4, 2");
        relloc.add("1, 4, 1");
        relloc.add("1, 4, 0");
        relloc.add("1, 4, -1");
        relloc.add("0, 4, -2");
        relloc.add("-1, 4, -2");
        relloc.add("-2, 4, -1");
        relloc.add("0, 4, 0, ladder4");
        relloc.add("1, 5, 2");
        relloc.add("0, 5, 2");
        relloc.add("-1, 5, 2");
        relloc.add("-2, 5, 2");
        relloc.add("1, 5, 1");
        relloc.add("0, 5, 1");
        relloc.add("-1, 5, 1");
        relloc.add("-2, 5, 1");
        relloc.add("1, 5, 0");
        relloc.add("-1, 5, 0");
        relloc.add("-2, 5, 0");
        relloc.add("1, 5, -1");
        relloc.add("0, 5, -1");
        relloc.add("-1, 5, -1");
        relloc.add("-2, 5, -1");
        relloc.add("0, 5, 0, ladder4");
        relloc.add("1, 5, -2");
        relloc.add("0, 5, -2");
        relloc.add("-1, 5, -2");
        relloc.add("-2, 5, -2");
        relloc.add("-2, 5, 3");
        relloc.add("-2, 6, 3");
        relloc.add("-2, 7, 3");
        relloc.add("-1, 6, 3");
        relloc.add("0, 6, 3");
        relloc.add("1, 5, 3");
        relloc.add("1, 6, 3");
        relloc.add("1, 7, 3");
        relloc.add("2, 5, 2");
        relloc.add("2, 6, 2");
        relloc.add("2, 7, 2");
        relloc.add("2, 6, 1");
        relloc.add("2, 5, 0");
        relloc.add("2, 6, 0");
        relloc.add("2, 7, 0");
        relloc.add("2, 6, -1");
        relloc.add("2, 5, -2");
        relloc.add("2, 6, -2");
        relloc.add("2, 7, -2");
        relloc.add("-2, 5, -3");
        relloc.add("-2, 6, -3");
        relloc.add("-2, 7, -3");
        relloc.add("-1, 6, -3");
        relloc.add("0, 6, -3");
        relloc.add("1, 5, -3");
        relloc.add("1, 6, -3");
        relloc.add("1, 7, -3");
        relloc.add("-3, 5, 2");
        relloc.add("-3, 6, 2");
        relloc.add("-3, 7, 2");
        relloc.add("-3, 6, 1");
        relloc.add("-3, 5, 0");
        relloc.add("-3, 6, 0");
        relloc.add("-3, 7, 0");
        relloc.add("-3, 6, -1");
        relloc.add("-3, 5, -2");
        relloc.add("-3, 6, -2");
        relloc.add("-3, 7, -2");
        return relloc;
    }
}
