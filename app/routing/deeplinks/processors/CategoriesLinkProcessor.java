package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.r;
import t9.y0;
/* compiled from: CategoriesLinkProcessor.kt */
/* loaded from: classes2.dex */
public final class CategoriesLinkProcessor {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37675b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37676c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepositories f37677a;

    /* compiled from: CategoriesLinkProcessor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String deeplink, Context context) {
            o.i(deeplink, "deeplink");
            o.i(context, "context");
            String string = context.getString(y0.f70531k2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public CategoriesLinkProcessor(CategoriesRepositories categoriesRepositories) {
        o.i(categoriesRepositories, "categoriesRepositories");
        this.f37677a = categoriesRepositories;
    }

    private final String b(String str) {
        List E0;
        Integer k11;
        int i11 = 0;
        E0 = StringsKt__StringsKt.E0(c(str), new char[]{'/'}, false, 0, 6, null);
        int size = E0.size() - 1;
        int size2 = E0.size();
        while (true) {
            if (i11 >= size2) {
                break;
            }
            k11 = r.k((String) E0.get(i11));
            if (k11 != null) {
                size = i11 - 1;
                break;
            }
            i11++;
        }
        if (size <= E0.size()) {
            return (String) E0.get(size);
        }
        return null;
    }

    private final String c(String str) {
        int Z;
        CharSequence s02;
        Z = StringsKt__StringsKt.Z(str, '?', 0, false, 6, null);
        if (Z != -1) {
            s02 = StringsKt__StringsKt.s0(str, Z, str.length());
            return s02.toString();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.content.Intent r3, java.lang.String r4, uf.c r5, uf.b r6, zz.a<? super wz.p> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof com.forsale.app.routing.deeplinks.processors.CategoriesLinkProcessor$execute$1
            if (r3 == 0) goto L13
            r3 = r7
            com.forsale.app.routing.deeplinks.processors.CategoriesLinkProcessor$execute$1 r3 = (com.forsale.app.routing.deeplinks.processors.CategoriesLinkProcessor$execute$1) r3
            int r5 = r3.f37682e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r3.f37682e = r5
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.processors.CategoriesLinkProcessor$execute$1 r3 = new com.forsale.app.routing.deeplinks.processors.CategoriesLinkProcessor$execute$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r5 = r3.f37680c
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r3.f37682e
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto L33
            java.lang.Object r4 = r3.f37679b
            r6 = r4
            uf.b r6 = (uf.b) r6
            java.lang.Object r3 = r3.f37678a
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            kotlin.f.b(r5)
            goto L53
        L33:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L3b:
            kotlin.f.b(r5)
            java.lang.String r5 = r2.b(r4)
            if (r5 == 0) goto L7a
            com.forsale.app.datalayer.repositories.CategoriesRepositories r0 = r2.f37677a
            r3.f37678a = r4
            r3.f37679b = r6
            r3.f37682e = r1
            java.lang.Object r5 = r0.getCategoryBySlug(r5, r3)
            if (r5 != r7) goto L53
            return r7
        L53:
            com.forsale.app.datalayer.database.CategoryEntity r5 = (com.forsale.app.datalayer.database.CategoryEntity) r5
            if (r5 == 0) goto L77
            boolean r3 = r5.isListingCategory()
            if (r3 != r1) goto L6a
            com.forsale.app.routing.deeplinks.processors.b$b r3 = new com.forsale.app.routing.deeplinks.processors.b$b
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r4 = com.forsale.app.routing.deeplinks.mappers.a.f(r4)
            r3.<init>(r5, r4)
            r6.h(r3)
            goto L7a
        L6a:
            com.forsale.app.routing.deeplinks.processors.b$a r3 = new com.forsale.app.routing.deeplinks.processors.b$a
            int r4 = r5.getId()
            r3.<init>(r4)
            r6.h(r3)
            goto L7a
        L77:
            r6.a0()
        L7a:
            wz.p r3 = wz.p.f75480a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.processors.CategoriesLinkProcessor.a(android.content.Intent, java.lang.String, uf.c, uf.b, zz.a):java.lang.Object");
    }
}
