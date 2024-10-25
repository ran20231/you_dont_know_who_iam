package com.forsale.app.utils.analytics;

import com.forsale.app.utils.TypeExtensionsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: EventsUtil.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40026a = new a(null);

    /* compiled from: EventsUtil.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, String> b(Map<String, ? extends Object> map) {
            Map h11;
            Map<String, String> n11;
            List list;
            h11 = j0.h();
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof List) {
                    list = (List) value;
                } else {
                    list = null;
                }
                arrayList.add(wz.i.a(key, TypeExtensionsKt.d(list)));
            }
            n11 = j0.n(h11, arrayList);
            return n11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
            r2 = kotlin.collections.j0.o(r1, r2);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, ? extends java.lang.Object> r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
            /*
                r0 = this;
                if (r1 == 0) goto Ld
                if (r2 == 0) goto Lc
                java.util.Map r2 = kotlin.collections.g0.o(r1, r2)
                if (r2 != 0) goto Lb
                goto Lc
            Lb:
                r1 = r2
            Lc:
                r2 = r1
            Ld:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.k.a.a(java.util.Map, java.util.Map):java.util.Map");
        }

        public final Map<String, Object> c(Map<String, ? extends Object> eventProperties) {
            Map<String, Object> o11;
            o.i(eventProperties, "eventProperties");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : eventProperties.entrySet()) {
                if (!(entry.getValue() instanceof List)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry2 : eventProperties.entrySet()) {
                if (entry2.getValue() instanceof List) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            o11 = j0.o(linkedHashMap, b(linkedHashMap2));
            return o11;
        }
    }
}
