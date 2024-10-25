package com.forsale.app.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.TypedValue;
import com.adjust.sdk.Constants;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.RequestConfiguration;
import com.leanplum.core.BuildConfig;
import falcon.chat.entities.Message;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
/* compiled from: TypeExtensions.kt */
/* loaded from: classes3.dex */
public final class TypeExtensionsKt {

    /* compiled from: TypeExtensions.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39660a;

        static {
            int[] iArr = new int[Languages.values().length];
            try {
                iArr[Languages.ENGLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f39660a = iArr;
        }
    }

    private static final String A() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "day";
        }
        return "يوم";
    }

    private static final boolean A0(wz.h<Boolean> hVar) {
        return hVar.getValue().booleanValue();
    }

    private static final String B(int i11) {
        String str = "#.";
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                str = str + "#";
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return str;
    }

    private static final boolean B0(wz.h<Boolean> hVar) {
        return hVar.getValue().booleanValue();
    }

    public static final double C(double d11) {
        boolean z11;
        if (Math.abs(d11) == Utils.DOUBLE_EPSILON) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return e.f40106a.b().c().doubleValue();
        }
        return d11;
    }

    public static final com.forsale.app.features.categories.listingdetails.a C0(long j11) {
        long j12 = 60;
        return new com.forsale.app.features.categories.listingdetails.a((int) (j11 / 2.6110079999999995E9d), (int) (j11 / 604800000), (int) (j11 / 86400000), (int) ((j11 / ((long) Constants.ONE_HOUR)) % 24), (int) ((j11 / 60000) % j12), (int) ((j11 / 1000) % j12));
    }

    public static final double D(double d11) {
        boolean z11;
        if (Math.abs(d11) == Utils.DOUBLE_EPSILON) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return e.f40106a.b().d().doubleValue();
        }
        return d11;
    }

    public static final String D0(String str, char c11) {
        kotlin.jvm.internal.o.i(str, "<this>");
        Locale l11 = LocaleManager.f39597a.l();
        try {
            String format = new SimpleDateFormat("dd" + c11 + " MMM yyyy", l11).format(Long.valueOf(new SimpleDateFormat("yyyy-MM-dd", l11).parse(str).getTime()));
            kotlin.jvm.internal.o.f(format);
            return format;
        } catch (ParseException unused) {
            return str;
        }
    }

    private static final String E() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "hour";
        }
        return "ساعه";
    }

    public static /* synthetic */ String E0(String str, char c11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c11 = ' ';
        }
        return D0(str, c11);
    }

    private static final String F() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "minute";
        }
        return " دقيقه";
    }

    public static final String F0(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        Locale l11 = LocaleManager.f39597a.l();
        try {
            String format = new SimpleDateFormat(g(l11), l11).format(Long.valueOf(new SimpleDateFormat("yyyy-MM-dd", l11).parse(str).getTime()));
            kotlin.jvm.internal.o.f(format);
            return format;
        } catch (ParseException unused) {
            return str;
        }
    }

    private static final String G() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "month";
        }
        return "شهر";
    }

    public static final String G0(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        try {
            String format = new SimpleDateFormat("d MMM yyyy", LocaleManager.f39597a.l()).format(v(str));
            kotlin.jvm.internal.o.f(format);
            return format;
        } catch (ParseException unused) {
            return str;
        }
    }

    private static final String H() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "now";
        }
        return "الآن";
    }

    public static final int I(int i11) {
        boolean z11;
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public static final List<Integer> I0(String str) {
        List E0;
        int i11;
        kotlin.jvm.internal.o.i(str, "<this>");
        E0 = StringsKt__StringsKt.E0(str, new char[]{','}, false, 0, 6, null);
        if (E0 != null) {
            List<String> list = E0;
            ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
            for (String str2 : list) {
                try {
                    i11 = Integer.parseInt(str2);
                } catch (Exception unused) {
                    i11 = -1;
                }
                arrayList.add(Integer.valueOf(i11));
            }
            return arrayList;
        }
        return null;
    }

    private static final String J() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "Today at ";
        }
        return "اليوم في ";
    }

    public static final String J0(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        try {
            String format = new SimpleDateFormat("d MMM yyyy, hh:mm a", LocaleManager.f39597a.l()).format(v(str));
            kotlin.jvm.internal.o.f(format);
            return format;
        } catch (ParseException unused) {
            return str;
        }
    }

    public static final Date K(String str, String pattern) {
        kotlin.jvm.internal.o.i(str, "<this>");
        kotlin.jvm.internal.o.i(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date parse = simpleDateFormat.parse(str);
        kotlin.jvm.internal.o.h(parse, "run(...)");
        return parse;
    }

    public static final String K0(int i11) {
        boolean z11 = false;
        if (1 <= i11 && i11 < 10) {
            z11 = true;
        }
        if (z11) {
            return String.valueOf(i11);
        }
        if (i11 > 9) {
            return "9+";
        }
        return null;
    }

    public static final long L(String str, String pattern) {
        kotlin.jvm.internal.o.i(str, "<this>");
        kotlin.jvm.internal.o.i(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str).getTime();
    }

    public static final String L0(String str, String str2) {
        kotlin.jvm.internal.o.i(str, "<this>");
        try {
            String format = new SimpleDateFormat("MMM yyyy").format(w(str, str2));
            kotlin.jvm.internal.o.f(format);
            return format;
        } catch (ParseException unused) {
            return str;
        }
    }

    private static final String M() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "week";
        }
        return "أسبوع";
    }

    public static final int M0(float f11, Context context) {
        kotlin.jvm.internal.o.i(context, "context");
        return (int) TypedValue.applyDimension(1, f11, context.getResources().getDisplayMetrics());
    }

    private static final String N() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "Yesterday at ";
        }
        return "أمس في ";
    }

    public static final List<String> N0(String str) {
        CharSequence Z0;
        List E0;
        boolean z11;
        kotlin.jvm.internal.o.i(str, "<this>");
        Z0 = StringsKt__StringsKt.Z0(str);
        E0 = StringsKt__StringsKt.E0(Z0.toString(), new char[]{' ', '\n', '\t'}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : E0) {
            if (((String) obj).length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean O(String str, String pattern) {
        kotlin.jvm.internal.o.i(str, "<this>");
        kotlin.jvm.internal.o.i(pattern, "pattern");
        return K(str, pattern).before(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());
    }

    public static final Uri O0(Uri uri, char c11) {
        String b12;
        kotlin.jvm.internal.o.i(uri, "<this>");
        String uri2 = uri.toString();
        kotlin.jvm.internal.o.h(uri2, "toString(...)");
        b12 = StringsKt__StringsKt.b1(uri2, c11);
        return Uri.parse(b12);
    }

    public static final boolean P(String str) {
        boolean I;
        kotlin.jvm.internal.o.i(str, "<this>");
        I = kotlin.text.s.I(str, "http", false, 2, null);
        return I;
    }

    public static final String P0(String str, boolean z11, boolean z12) {
        List F0;
        List<String> n11;
        String d12;
        String d13;
        boolean z13;
        boolean z14;
        String d14;
        CharSequence Z0;
        kotlin.jvm.internal.o.i(str, "<this>");
        F0 = StringsKt__StringsKt.F0(str, new String[]{"--_--"}, false, 0, 6, null);
        List<String> list = F0;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
        for (String str2 : list) {
            d14 = StringsKt__StringsKt.d1(str2, ',');
            Z0 = StringsKt__StringsKt.Z0(d14);
            arrayList.add(Z0.toString());
        }
        List X0 = kotlin.collections.p.X0(arrayList);
        if (!X0.isEmpty()) {
            ListIterator listIterator = X0.listIterator(X0.size());
            while (listIterator.hasPrevious()) {
                if (!kotlin.jvm.internal.o.d((String) listIterator.previous(), "")) {
                    n11 = kotlin.collections.p.Q0(X0, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        n11 = kotlin.collections.p.n();
        if (n11.size() > 1) {
            if (z12 && n11.size() > 3) {
                z13 = z11;
                z14 = true;
            } else {
                z13 = z11;
                z14 = false;
            }
            n11 = b0(n11, z13, z14);
        }
        d12 = StringsKt__StringsKt.d1(kotlin.collections.p.t0(n11, ", ", null, null, 0, null, null, 62, null), ',');
        d13 = StringsKt__StringsKt.d1(d12, ' ');
        return d13;
    }

    public static final boolean Q(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        return kotlin.collections.j.J(dj.a.f54274a.b(), j(str));
    }

    public static /* synthetic */ String Q0(String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return P0(str, z11, z12);
    }

    public static final boolean R(String str) {
        boolean z11;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 || kotlin.jvm.internal.o.d(str, "null")) {
            return false;
        }
        return true;
    }

    public static final String R0(String str, Integer num) {
        List F0;
        List<String> n11;
        String d12;
        String d13;
        String d14;
        CharSequence Z0;
        kotlin.jvm.internal.o.i(str, "<this>");
        F0 = StringsKt__StringsKt.F0(str, new String[]{"--_--"}, false, 0, 6, null);
        List<String> list = F0;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
        for (String str2 : list) {
            d14 = StringsKt__StringsKt.d1(str2, ',');
            Z0 = StringsKt__StringsKt.Z0(d14);
            arrayList.add(Z0.toString());
        }
        List X0 = kotlin.collections.p.X0(arrayList);
        if (!X0.isEmpty()) {
            ListIterator listIterator = X0.listIterator(X0.size());
            while (listIterator.hasPrevious()) {
                if (!kotlin.jvm.internal.o.d((String) listIterator.previous(), "")) {
                    n11 = kotlin.collections.p.Q0(X0, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        n11 = kotlin.collections.p.n();
        if (n11.size() > 1) {
            n11 = b0(n11, true, false);
        }
        if (num != null) {
            n11 = kotlin.collections.p.R0(n11, num.intValue());
        }
        d12 = StringsKt__StringsKt.d1(kotlin.collections.p.t0(n11, ", ", null, null, 0, null, null, 62, null), ',');
        d13 = StringsKt__StringsKt.d1(d12, ' ');
        return d13;
    }

    public static final boolean S(String str) {
        boolean N;
        kotlin.jvm.internal.o.i(str, "<this>");
        N = StringsKt__StringsKt.N(Message.PDF, j(str), false, 2, null);
        return N;
    }

    public static final String S0(String str, boolean z11, boolean z12) {
        List F0;
        List<String> n11;
        String d12;
        String d13;
        boolean z13;
        boolean z14;
        String d14;
        CharSequence Z0;
        kotlin.jvm.internal.o.i(str, "<this>");
        F0 = StringsKt__StringsKt.F0(str, new String[]{"--_--"}, false, 0, 6, null);
        List<String> list = F0;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
        for (String str2 : list) {
            d14 = StringsKt__StringsKt.d1(str2, ',');
            Z0 = StringsKt__StringsKt.Z0(d14);
            arrayList.add(Z0.toString());
        }
        List X0 = kotlin.collections.p.X0(arrayList);
        if (!X0.isEmpty()) {
            ListIterator listIterator = X0.listIterator(X0.size());
            while (listIterator.hasPrevious()) {
                if (!kotlin.jvm.internal.o.d((String) listIterator.previous(), "")) {
                    n11 = kotlin.collections.p.Q0(X0, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        n11 = kotlin.collections.p.n();
        if (n11.size() > 1) {
            if (z12 && n11.size() > 3) {
                z13 = z11;
                z14 = true;
            } else {
                z13 = z11;
                z14 = false;
            }
            n11 = b0(n11, z13, z14);
        }
        d12 = StringsKt__StringsKt.d1(kotlin.collections.p.t0(kotlin.collections.p.H0(n11), ", ", null, null, 0, null, null, 62, null), ',');
        d13 = StringsKt__StringsKt.d1(d12, ' ');
        return d13;
    }

    public static final String T(int i11) {
        return NumberFormat.getNumberInstance(new Locale(LocaleManager.f39597a.k())).format(Integer.valueOf(i11));
    }

    public static /* synthetic */ String T0(String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return S0(str, z11, z12);
    }

    public static final String U(float f11) {
        return NumberFormat.getNumberInstance(new Locale(LocaleManager.f39597a.k())).format(Float.valueOf(f11));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String U0(java.lang.String r1, java.lang.String r2) {
        /*
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.o.i(r2, r0)
            if (r1 == 0) goto L10
            boolean r0 = kotlin.text.k.v(r1)
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 != 0) goto L18
            goto L19
        L18:
            r2 = r1
        L19:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.TypeExtensionsKt.U0(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final String V(int i11) {
        String K0 = K0(i11);
        if (LocaleManager.f39597a.r()) {
            return l.a(K0);
        }
        return K0;
    }

    public static final String V0(String str) {
        int f02;
        kotlin.jvm.internal.o.i(str, "<this>");
        f02 = StringsKt__StringsKt.f0(str, '/', 0, false, 6, null);
        String substring = str.substring(f02 + 1);
        kotlin.jvm.internal.o.h(substring, "substring(...)");
        return substring;
    }

    public static final String W(String str) {
        CharSequence z02;
        kotlin.jvm.internal.o.i(str, "<this>");
        try {
            z02 = StringsKt__StringsKt.z0(str, new m00.i(3, 7), "*****");
            return z02.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final int W0(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        return N0(str).size();
    }

    private static final List<String> X() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return kotlin.collections.p.q("K", "M", "B", RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        }
        return kotlin.collections.p.q("ألف", "مليون", "مليار", "ترليون");
    }

    public static final <T> Map<String, Object> Y(Map<String, ? extends Object> map, String key, T t11) {
        Map map2;
        kotlin.jvm.internal.o.i(map, "<this>");
        kotlin.jvm.internal.o.i(key, "key");
        if (t11 != null) {
            map2 = kotlin.collections.g0.f(wz.i.a(key, t11));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = kotlin.collections.g0.h();
        }
        return kotlin.collections.g0.o(map, map2);
    }

    public static final String Z(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        return new Regex("\\s").f(str, "");
    }

    public static final String a0(String str) {
        CharSequence Z0;
        kotlin.jvm.internal.o.i(str, "<this>");
        Z0 = StringsKt__StringsKt.Z0(new Regex("\\s").f(str, " "));
        return Z0.toString();
    }

    public static final long b(String str, String pattern) {
        kotlin.jvm.internal.o.i(str, "<this>");
        kotlin.jvm.internal.o.i(pattern, "pattern");
        return Math.abs(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis() - L(str, pattern));
    }

    private static final List<String> b0(List<String> list, boolean z11, boolean z12) {
        if (z11 && z12) {
            return kotlin.collections.p.e0(kotlin.collections.p.d0(list, 1), 1);
        }
        if (z11) {
            return kotlin.collections.p.d0(list, 1);
        }
        if (z12) {
            return kotlin.collections.p.e0(list, 1);
        }
        return list;
    }

    public static final String c(String str) {
        boolean I;
        boolean I2;
        kotlin.jvm.internal.o.i(str, "<this>");
        I = kotlin.text.s.I(str, "+", false, 2, null);
        if (!I) {
            I2 = kotlin.text.s.I(str, "00", false, 2, null);
            if (!I2) {
                return "+" + str;
            }
        }
        return String.valueOf(str);
    }

    public static final String c0(String str) {
        String B;
        kotlin.jvm.internal.o.i(str, "<this>");
        B = kotlin.text.s.B(str, (char) 1548, ' ', false, 4, null);
        return B;
    }

    public static final String d(List<String> list) {
        String t02;
        if (list == null || (t02 = kotlin.collections.p.t0(list, ",", null, null, 0, null, null, 62, null)) == null) {
            return "";
        }
        return t02;
    }

    public static final String d0(String str, char c11) {
        boolean z11;
        String f12;
        kotlin.jvm.internal.o.i(str, "<this>");
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f12 = kotlin.text.u.f1(str, 1);
            return f12 + c11;
        }
        return str;
    }

    private static final String e(double d11, int i11) {
        boolean z11;
        String format;
        NumberFormat r11 = r();
        double d12 = (d11 / 100) / 10.0d;
        double d13 = 10;
        double d14 = d12 * d13;
        if (d14 % d13 == Utils.DOUBLE_EPSILON) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d12 < 1000.0d) {
            if (d12 <= 99.9d && !z11 && (z11 || d12 <= 9.99d)) {
                format = r11.format(d12);
            } else {
                format = r11.format(d14 / d13);
            }
            String str = X().get(i11);
            return format + " " + ((Object) str);
        }
        return e(d12, i11 + 1);
    }

    public static final String e0(String str) {
        String C;
        kotlin.jvm.internal.o.i(str, "<this>");
        C = kotlin.text.s.C(str, "--_--", "-", false, 4, null);
        return C;
    }

    static /* synthetic */ String f(double d11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return e(d11, i11);
    }

    public static final String f0(String str) {
        String B;
        String B2;
        String C;
        kotlin.jvm.internal.o.i(str, "<this>");
        B = kotlin.text.s.B(c0(str), ',', ' ', false, 4, null);
        B2 = kotlin.text.s.B(B, '-', ' ', false, 4, null);
        C = kotlin.text.s.C(B2, "'", "", false, 4, null);
        return C;
    }

    public static final String g(Locale locale) {
        kotlin.jvm.internal.o.i(locale, "<this>");
        if (kotlin.jvm.internal.o.d(locale, Locale.ENGLISH)) {
            return "dd/M/yyyy";
        }
        return "yyyy/M/dd";
    }

    public static final String g0(Throwable th2) {
        String str;
        kotlin.jvm.internal.o.i(th2, "<this>");
        if (th2.getLocalizedMessage() != null) {
            str = th2.getLocalizedMessage();
        } else {
            str = "";
        }
        kotlin.jvm.internal.o.f(str);
        return str;
    }

    public static final float h(Context context, int i11) {
        float f11;
        int i12;
        if (context != null) {
            f11 = i11;
            i12 = context.getResources().getDisplayMetrics().densityDpi;
        } else {
            f11 = i11;
            i12 = Resources.getSystem().getDisplayMetrics().densityDpi;
        }
        return f11 * (i12 / 160);
    }

    public static final boolean h0(int i11) {
        if (i11 > 0) {
            return true;
        }
        return false;
    }

    public static final int i(int i11, Context context) {
        kotlin.jvm.internal.o.i(context, "context");
        return i11 * (context.getResources().getDisplayMetrics().densityDpi / 160);
    }

    public static final boolean i0(Integer num) {
        int i11;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public static final String j(String str) {
        int f02;
        kotlin.jvm.internal.o.i(str, "<this>");
        f02 = StringsKt__StringsKt.f0(str, '.', 0, false, 6, null);
        String substring = str.substring(f02 + 1);
        kotlin.jvm.internal.o.h(substring, "substring(...)");
        return substring;
    }

    public static final String j0(double d11) {
        if (d11 < 10000.0d) {
            String format = r().format(d11);
            kotlin.jvm.internal.o.h(format, "format(...)");
            return format;
        }
        return f(d11, 0, 2, null);
    }

    public static final List<ListingItemBrief.AttrInfo> k(List<ListingItemBrief.AttrInfo> list, AttributeType attributeType) {
        boolean z11;
        kotlin.jvm.internal.o.i(list, "<this>");
        kotlin.jvm.internal.o.i(attributeType, "attributeType");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ListingItemBrief.AttrInfo) obj).getType() == attributeType) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final String k0(long j11, boolean z11, final String str) {
        boolean z12;
        boolean z13;
        final Locale l11 = LocaleManager.f39597a.l();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        Calendar calendar2 = Calendar.getInstance();
        wz.h a11 = kotlin.c.a(new g00.a<String>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTime$yearFormatted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return new SimpleDateFormat("dd MMM yyyy", l11).format(calendar.getTime());
            }
        });
        wz.h a12 = kotlin.c.a(new g00.a<String>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTime$timeFormatted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return new SimpleDateFormat("hh:mm a", l11).format(calendar.getTime());
            }
        });
        wz.h a13 = kotlin.c.a(new g00.a<String>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTime$dayMonthFormatted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return new SimpleDateFormat("dd MMM", l11).format(calendar.getTime());
            }
        });
        boolean z14 = false;
        if (calendar.get(6) == calendar2.get(6)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (calendar2.get(6) - calendar.get(6) == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        wz.h a14 = kotlin.c.a(new g00.a<String>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTime$customFormatted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    return null;
                }
                return new SimpleDateFormat(str, l11).format(calendar.getTime());
            }
        });
        if (z12) {
            return J() + p0(a12);
        } else if (z13) {
            return N() + p0(a12);
        } else if (!z11) {
            return String.valueOf(q0(a13));
        } else {
            String r02 = r0(a14);
            if (r02 == null || r02.length() == 0) {
                z14 = true;
            }
            if (!z14) {
                String r03 = r0(a14);
                kotlin.jvm.internal.o.f(r03);
                return r03;
            }
            return o0(a11) + " " + q() + " " + p0(a12);
        }
    }

    public static final String l(String str, String regionPrefix) {
        boolean I;
        boolean I2;
        kotlin.jvm.internal.o.i(str, "<this>");
        kotlin.jvm.internal.o.i(regionPrefix, "regionPrefix");
        I = kotlin.text.s.I(str, "+" + regionPrefix, false, 2, null);
        if (!I) {
            I2 = kotlin.text.s.I(str, regionPrefix, false, 2, null);
            if (I2) {
                return c("+" + str);
            }
            return c("+" + regionPrefix + str);
        }
        return String.valueOf(str);
    }

    public static final String l0(String str, String str2, boolean z11, String str3) {
        kotlin.jvm.internal.o.i(str, "<this>");
        return k0(w(str, str2).getTime(), z11, str3);
    }

    public static final double m(double d11, int i11) {
        String format = new DecimalFormat(B(i11), new DecimalFormatSymbols(Locale.ENGLISH)).format(d11);
        kotlin.jvm.internal.o.h(format, "format(...)");
        return Double.parseDouble(format);
    }

    public static /* synthetic */ String m0(long j11, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return k0(j11, z11, str);
    }

    public static /* synthetic */ double n(double d11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 6;
        }
        return m(d11, i11);
    }

    public static /* synthetic */ String n0(String str, String str2, boolean z11, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "UTC";
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return l0(str, str2, z11, str3);
    }

    public static final String o(float f11) {
        DecimalFormat decimalFormat = new DecimalFormat(BuildConfig.BUILD_NUMBER);
        decimalFormat.setMinimumFractionDigits(2);
        String format = decimalFormat.format(Float.valueOf(f11));
        kotlin.jvm.internal.o.h(format, "format(...)");
        return format;
    }

    private static final String o0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    public static final String p(float f11) {
        DecimalFormat decimalFormat = new DecimalFormat(BuildConfig.BUILD_NUMBER);
        decimalFormat.setMaximumFractionDigits(2);
        String format = decimalFormat.format(Float.valueOf(f11));
        kotlin.jvm.internal.o.h(format, "format(...)");
        return format;
    }

    private static final String p0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    private static final String q() {
        if (a.f39660a[LocaleManager.f39597a.g().ordinal()] == 1) {
            return "at";
        }
        return "في";
    }

    private static final String q0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    private static final NumberFormat r() {
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale(LocaleManager.f39597a.k()));
        numberFormat.setMinimumFractionDigits(0);
        numberFormat.setMaximumFractionDigits(1);
        numberFormat.setGroupingUsed(false);
        return numberFormat;
    }

    private static final String r0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    private static final Date s(String str, String str2) {
        return new Date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", LocaleManager.f39597a.l()).parse(str).getTime() + TimeZone.getTimeZone(str2).getRawOffset());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String s0(long r13) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.TypeExtensionsKt.s0(long):java.lang.String");
    }

    public static final com.forsale.app.features.categories.listingdetails.a t(String str, String datePattern) {
        kotlin.jvm.internal.o.i(str, "<this>");
        kotlin.jvm.internal.o.i(datePattern, "datePattern");
        return C0(b(str, datePattern));
    }

    private static final String t0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    public static final String u(Date date) {
        kotlin.jvm.internal.o.i(date, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(Long.valueOf(date.getTime()));
        kotlin.jvm.internal.o.h(format, "let(...)");
        return format;
    }

    public static final String u0(long j11) {
        boolean z11;
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        Calendar calendar2 = Calendar.getInstance();
        final wz.h a11 = kotlin.c.a(new g00.a<Calendar>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTimeWeek$weekBefore$2
            @Override // g00.a
            public final Calendar invoke() {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.add(5, -7);
                return calendar3;
            }
        });
        wz.h a12 = kotlin.c.a(new g00.a<String>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTimeWeek$yearFormatted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return new SimpleDateFormat("MMM dd, yyyy").format(calendar.getTime());
            }
        });
        wz.h a13 = kotlin.c.a(new g00.a<String>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTimeWeek$dateFormatted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return new SimpleDateFormat("MMM dd").format(calendar.getTime());
            }
        });
        wz.h a14 = kotlin.c.a(new g00.a<String>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTimeWeek$dayFormatted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return new SimpleDateFormat("E").format(calendar.getTime());
            }
        });
        wz.h a15 = kotlin.c.a(new g00.a<String>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTimeWeek$timeFormatted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return new SimpleDateFormat("hh:mm a").format(calendar.getTime());
            }
        });
        boolean z12 = false;
        if (calendar.get(6) == calendar2.get(6)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (calendar2.get(6) - calendar.get(6) == 1) {
            z12 = true;
        }
        wz.h a16 = kotlin.c.a(new g00.a<Boolean>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTimeWeek$fromWeek$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                Calendar v02;
                Calendar calendar3 = calendar;
                v02 = TypeExtensionsKt.v0(a11);
                return Boolean.valueOf(calendar3.before(v02));
            }
        });
        wz.h a17 = kotlin.c.a(new g00.a<Boolean>() { // from class: com.forsale.app.utils.TypeExtensionsKt$toDateAndTimeWeek$duringWeek$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                Calendar v02;
                Calendar calendar3 = calendar;
                v02 = TypeExtensionsKt.v0(a11);
                return Boolean.valueOf(calendar3.after(v02));
            }
        });
        if (z11) {
            String J = J();
            String z02 = z0(a15);
            kotlin.jvm.internal.o.h(z02, "toDateAndTimeWeek$lambda$20(...)");
            String upperCase = z02.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.o.h(upperCase, "toUpperCase(...)");
            return J + upperCase;
        } else if (z12) {
            String N = N();
            String z03 = z0(a15);
            kotlin.jvm.internal.o.h(z03, "toDateAndTimeWeek$lambda$20(...)");
            String upperCase2 = z03.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.o.h(upperCase2, "toUpperCase(...)");
            return N + upperCase2;
        } else if (B0(a17)) {
            String upperCase3 = (y0(a14) + " ").toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.o.h(upperCase3, "toUpperCase(...)");
            return upperCase3;
        } else if (A0(a16)) {
            String upperCase4 = (x0(a13) + " ").toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.o.h(upperCase4, "toUpperCase(...)");
            return upperCase4;
        } else {
            String upperCase5 = (w0(a12) + " " + q() + " " + z0(a15)).toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.o.h(upperCase5, "toUpperCase(...)");
            return upperCase5;
        }
    }

    public static final Date v(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        return x(str, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Calendar v0(wz.h<? extends Calendar> hVar) {
        return hVar.getValue();
    }

    public static final Date w(String dateString, String str) {
        kotlin.jvm.internal.o.i(dateString, "dateString");
        if (str == null) {
            str = "UTC";
        }
        try {
            return s(dateString, str);
        } catch (ParseException e11) {
            String message = e11.getMessage();
            x10.a.b("Exception:: " + message, new Object[0]);
            return new Date(System.currentTimeMillis());
        }
    }

    private static final String w0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    public static /* synthetic */ Date x(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return w(str, str2);
    }

    private static final String x0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    public static final Date y(Date date) {
        kotlin.jvm.internal.o.i(date, "<this>");
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", LocaleManager.f39597a.l()).parse(u(date));
        kotlin.jvm.internal.o.h(parse, "parse(...)");
        return parse;
    }

    private static final String y0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    public static final Date z(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", LocaleManager.f39597a.l()).parse(str);
    }

    private static final String z0(wz.h<String> hVar) {
        return hVar.getValue();
    }

    public static final int H0(boolean z11) {
        return z11 ? 1 : 0;
    }
}
