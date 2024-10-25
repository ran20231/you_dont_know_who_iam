package com.forsale.app.utils.validation;

import android.widget.EditText;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import g00.l;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.s;
import mj.b;
import wz.p;
/* compiled from: PhoneDetector.kt */
/* loaded from: classes3.dex */
public final class PhoneDetectorKt {
    public static final char a(char c11) {
        boolean z11;
        int i11;
        boolean z12 = true;
        if (1632 <= c11 && c11 < 1642) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 = c11 - 1584;
        } else {
            if (1776 > c11 || c11 >= 1786) {
                z12 = false;
            }
            if (z12) {
                i11 = c11 - 1728;
            } else {
                return c11;
            }
        }
        return (char) i11;
    }

    public static final void b(EditText editText, b phoneDetectorListener) {
        o.i(editText, "<this>");
        o.i(phoneDetectorListener, "phoneDetectorListener");
        editText.addTextChangedListener(new PhoneDetectorKt$detectPhones$1(phoneDetectorListener));
    }

    public static final ArrayList<String> c(String str, l<? super String, Boolean> validator) {
        o.i(str, "<this>");
        o.i(validator, "validator");
        ArrayList<String> arrayList = new ArrayList<>();
        String d11 = d(str);
        if (d11 != null) {
            if (!validator.invoke(i(h(d11))).booleanValue()) {
                d11 = null;
            }
            if (d11 != null) {
                arrayList.add(d11);
            }
        }
        return arrayList;
    }

    private static final String d(String str) {
        String group;
        boolean I;
        boolean I2;
        boolean I3;
        boolean I4;
        Pattern pattern;
        Matcher matcher = Pattern.compile("(\\+)?(965)?(٩٦٥)?((?!\\+)(?!965)(?!٩٦٥)[!@#$%^&(),.?\":{}|<>\\s+\\-_]*[0-9٠-٩][!@#$%^&(),.?\":{}|<>\\s+\\-_]*){8,}").matcher(str);
        if (matcher.find() && (group = matcher.group(0)) != null) {
            I = s.I(group, "6", false, 2, null);
            if (!I) {
                I2 = s.I(group, "٦", false, 2, null);
                if (!I2) {
                    I3 = s.I(group, "5", false, 2, null);
                    if (!I3) {
                        I4 = s.I(group, "٥", false, 2, null);
                        if (I4) {
                            pattern = Pattern.compile("[9٩][!@#$%^&(),.?\":{}|<>\\s+\\-_]*[6٦][!@#$%^&(),.?\":{}|<>\\s+\\-_]*(" + group + ")");
                        } else {
                            pattern = null;
                        }
                    } else {
                        pattern = Pattern.compile("[9٩][!@#$%^&(),.?\":{}|<>\\s+\\-_]*[6٦][!@#$%^&(),.?\":{}|<>\\s+\\-_]*(" + group + ")");
                    }
                } else {
                    pattern = Pattern.compile("[9٩][!@#$%^&(),.?\":{}|<>\\s+\\-_]*(" + group + ")");
                }
            } else {
                pattern = Pattern.compile("[9٩][!@#$%^&(),.?\":{}|<>\\s+\\-_]*(" + group + ")");
            }
            if (pattern != null) {
                if (pattern.matcher(str).find()) {
                    return null;
                }
                p pVar = p.f75480a;
            }
            return group;
        }
        return null;
    }

    public static final boolean e(String str, String str2) {
        String str3;
        String r02;
        o.i(str, "<this>");
        if (str2 != null) {
            str3 = StringsKt__StringsKt.r0(str2, "965");
        } else {
            str3 = null;
        }
        r02 = StringsKt__StringsKt.r0(i(h(str)), "965");
        return o.d(r02, str3);
    }

    public static final boolean f(String str, String countryCode) {
        o.i(str, "<this>");
        o.i(countryCode, "countryCode");
        PhoneNumberUtil p11 = PhoneNumberUtil.p();
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        o.h(upperCase, "toUpperCase(...)");
        return p11.G(str, upperCase);
    }

    public static final boolean g(String str) {
        String r02;
        o.i(str, "<this>");
        r02 = StringsKt__StringsKt.r0(str, "965");
        return new Regex("^[0-9]{8,}$").d(r02);
    }

    public static final String h(String str) {
        String t02;
        o.i(str, "<this>");
        ArrayList arrayList = new ArrayList(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            arrayList.add(Character.valueOf(a(str.charAt(i11))));
        }
        t02 = CollectionsKt___CollectionsKt.t0(arrayList, "", null, null, 0, null, null, 62, null);
        return t02;
    }

    public static final String i(String str) {
        o.i(str, "<this>");
        String replaceAll = Pattern.compile("[^a-zA-Zء-ي0-9]").matcher(str).replaceAll("");
        o.h(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
