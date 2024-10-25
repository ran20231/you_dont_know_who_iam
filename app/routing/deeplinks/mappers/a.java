package com.forsale.app.routing.deeplinks.mappers;

import android.net.Uri;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
/* compiled from: CategoryListingDeepLinkMapper.kt */
/* loaded from: classes2.dex */
public final class a {
    private static final List<GetListingsBody.FiltrationData.Attribute<?>> a(Uri uri) {
        List<GetListingsBody.FiltrationData.Attribute<?>> n11;
        int y11;
        Integer k11;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        o.h(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            String str = (String) obj;
            Regex[] regex = AttributesParametersRegex.BOOLEAN.getRegex();
            int length = regex.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Regex regex2 = regex[i11];
                o.f(str);
                if (regex2.d(str)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            n11 = r.n();
            return n11;
        }
        List<String> queryParameters = uri.getQueryParameters("b_a");
        o.h(queryParameters, "getQueryParameters(...)");
        ArrayList<Number> arrayList2 = new ArrayList();
        for (String str2 : queryParameters) {
            o.f(str2);
            k11 = kotlin.text.r.k(str2);
            if (k11 != null) {
                arrayList2.add(k11);
            }
        }
        y11 = s.y(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(y11);
        for (Number number : arrayList2) {
            arrayList3.add(new GetListingsBody.FiltrationData.Attribute(number.intValue(), AttributeType.BOOL.getValue(), null, null, null, 28, null));
        }
        return arrayList3;
    }

    private static final List<GetListingsBody.FiltrationData.Attribute<?>> b(Uri uri) {
        List<GetListingsBody.FiltrationData.Attribute<?>> n11;
        Set c12;
        int y11;
        Integer k11;
        Integer k12;
        String C;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        o.h(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            String str = (String) obj;
            Regex[] regex = AttributesParametersRegex.DROP_DOWN.getRegex();
            int length = regex.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Regex regex2 = regex[i11];
                o.f(str);
                if (regex2.d(str)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList<String> arrayList2 = new ArrayList();
            for (String str2 : arrayList) {
                o.f(str2);
                C = kotlin.text.s.C(str2, "a", "", false, 4, null);
                if (C != null) {
                    arrayList2.add(C);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str3 : arrayList2) {
                k12 = kotlin.text.r.k(str3);
                if (k12 != null) {
                    arrayList3.add(k12);
                }
            }
            c12 = CollectionsKt___CollectionsKt.c1(arrayList3);
            if (c12 != null) {
                Set<Number> set = c12;
                y11 = s.y(set, 10);
                ArrayList arrayList4 = new ArrayList(y11);
                for (Number number : set) {
                    int intValue = number.intValue();
                    List<String> queryParameters = uri.getQueryParameters("a" + intValue);
                    o.h(queryParameters, "getQueryParameters(...)");
                    ArrayList arrayList5 = new ArrayList();
                    for (String str4 : queryParameters) {
                        o.f(str4);
                        k11 = kotlin.text.r.k(str4);
                        if (k11 != null) {
                            arrayList5.add(k11);
                        }
                    }
                    arrayList4.add(new GetListingsBody.FiltrationData.Attribute(intValue, AttributeType.DROP_DOWN.getValue(), arrayList5, null, null, 24, null));
                }
                return arrayList4;
            }
        }
        n11 = r.n();
        return n11;
    }

    private static final List<GetListingsBody.FiltrationData.Attribute<?>> c(Uri uri) {
        List<GetListingsBody.FiltrationData.Attribute<?>> n11;
        Set c12;
        int y11;
        Integer k11;
        Integer k12;
        String C;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        o.h(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            String str = (String) obj;
            Regex[] regex = AttributesParametersRegex.NUMBER.getRegex();
            int length = regex.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Regex regex2 = regex[i11];
                o.f(str);
                if (regex2.d(str)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList<String> arrayList2 = new ArrayList();
            for (String str2 : arrayList) {
                o.f(str2);
                C = kotlin.text.s.C(str2, "n_a", "", false, 4, null);
                if (C != null) {
                    arrayList2.add(C);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str3 : arrayList2) {
                k12 = kotlin.text.r.k(str3);
                if (k12 != null) {
                    arrayList3.add(k12);
                }
            }
            c12 = CollectionsKt___CollectionsKt.c1(arrayList3);
            if (c12 != null) {
                Set<Number> set = c12;
                y11 = s.y(set, 10);
                ArrayList arrayList4 = new ArrayList(y11);
                for (Number number : set) {
                    int intValue = number.intValue();
                    List<String> queryParameters = uri.getQueryParameters("n_a" + intValue);
                    o.h(queryParameters, "getQueryParameters(...)");
                    ArrayList arrayList5 = new ArrayList();
                    for (String str4 : queryParameters) {
                        o.f(str4);
                        k11 = kotlin.text.r.k(str4);
                        if (k11 != null) {
                            arrayList5.add(k11);
                        }
                    }
                    arrayList4.add(new GetListingsBody.FiltrationData.Attribute(intValue, AttributeType.NUMBER.getValue(), arrayList5, null, null, 24, null));
                }
                return arrayList4;
            }
        }
        n11 = r.n();
        return n11;
    }

    private static final List<GetListingsBody.FiltrationData.Attribute<?>> d(Uri uri) {
        List<GetListingsBody.FiltrationData.Attribute<?>> n11;
        Set c12;
        int y11;
        Integer num;
        Integer num2;
        Integer k11;
        Integer k12;
        boolean N;
        boolean N2;
        Integer num3;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        o.h(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList<String> arrayList = new ArrayList();
        Iterator<T> it2 = queryParameterNames.iterator();
        while (true) {
            boolean z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String str = (String) next;
            Regex[] regex = AttributesParametersRegex.RANGE.getRegex();
            int length = regex.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Regex regex2 = regex[i11];
                o.f(str);
                if (regex2.d(str)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : arrayList) {
                o.f(str2);
                N = StringsKt__StringsKt.N(str2, "at", false, 2, null);
                if (N) {
                    str2 = kotlin.text.s.C(str2, "at", "", false, 4, null);
                } else {
                    N2 = StringsKt__StringsKt.N(str2, "af", false, 2, null);
                    if (N2) {
                        str2 = kotlin.text.s.C(str2, "af", "", false, 4, null);
                    }
                }
                if (str2 != null) {
                    num3 = kotlin.text.r.k(str2);
                } else {
                    num3 = null;
                }
                if (num3 != null) {
                    arrayList2.add(num3);
                }
            }
            c12 = CollectionsKt___CollectionsKt.c1(arrayList2);
            if (c12 != null) {
                Set<Number> set = c12;
                y11 = s.y(set, 10);
                ArrayList arrayList3 = new ArrayList(y11);
                for (Number number : set) {
                    int intValue = number.intValue();
                    String queryParameter = uri.getQueryParameter("af" + intValue);
                    if (queryParameter != null) {
                        o.f(queryParameter);
                        k12 = kotlin.text.r.k(queryParameter);
                        num = k12;
                    } else {
                        num = null;
                    }
                    String queryParameter2 = uri.getQueryParameter("at" + intValue);
                    if (queryParameter2 != null) {
                        o.f(queryParameter2);
                        k11 = kotlin.text.r.k(queryParameter2);
                        num2 = k11;
                    } else {
                        num2 = null;
                    }
                    arrayList3.add(new GetListingsBody.FiltrationData.Attribute(intValue, AttributeType.NUMBER.getValue(), null, num, num2, 4, null));
                }
                return arrayList3;
            }
        }
        n11 = r.n();
        return n11;
    }

    private static final List<GetListingsBody.FiltrationData.Attribute<?>> e(Uri uri) {
        List E0;
        List E02;
        List<GetListingsBody.FiltrationData.Attribute<?>> E03;
        E0 = CollectionsKt___CollectionsKt.E0(d(uri), b(uri));
        E02 = CollectionsKt___CollectionsKt.E0(E0, c(uri));
        E03 = CollectionsKt___CollectionsKt.E0(E02, a(uri));
        return E03;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.mappers.a.f(java.lang.String):com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData");
    }
}
