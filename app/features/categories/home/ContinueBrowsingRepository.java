package com.forsale.app.features.categories.home;

import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import jj.b;
import kotlin.jvm.internal.o;
import oa.g;
import wz.p;
import zz.a;
/* compiled from: ContinueBrowsingRepository.kt */
/* loaded from: classes2.dex */
public final class ContinueBrowsingRepository {

    /* renamed from: a  reason: collision with root package name */
    private final b f23318a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoriesRepositories f23319b;

    public ContinueBrowsingRepository(b prefs, CategoriesRepositories categoriesRepositories) {
        o.i(prefs, "prefs");
        o.i(categoriesRepositories, "categoriesRepositories");
        this.f23318a = prefs;
        this.f23319b = categoriesRepositories;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(oa.f r5, zz.a<? super oa.g> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.home.ContinueBrowsingRepository$getContinueBrowsingIfCategoryActive$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.home.ContinueBrowsingRepository$getContinueBrowsingIfCategoryActive$1 r0 = (com.forsale.app.features.categories.home.ContinueBrowsingRepository$getContinueBrowsingIfCategoryActive$1) r0
            int r1 = r0.f23323d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23323d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.ContinueBrowsingRepository$getContinueBrowsingIfCategoryActive$1 r0 = new com.forsale.app.features.categories.home.ContinueBrowsingRepository$getContinueBrowsingIfCategoryActive$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f23321b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f23323d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f23320a
            oa.f r5 = (oa.f) r5
            kotlin.f.b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r6 = r4.f23319b
            int r2 = r5.a()
            r0.f23320a = r5
            r0.f23323d = r3
            java.lang.Object r6 = r6.getCategory(r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.forsale.app.datalayer.database.CategoryEntity r6 = (com.forsale.app.datalayer.database.CategoryEntity) r6
            if (r6 == 0) goto L57
            oa.g r0 = new oa.g
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r5 = r5.b()
            r0.<init>(r6, r5)
            goto L58
        L57:
            r0 = 0
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.ContinueBrowsingRepository.c(oa.f, zz.a):java.lang.Object");
    }

    public final Object b(g gVar, a<? super p> aVar) {
        Object f11;
        Object b11 = this.f23318a.b().b(gVar.d(), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (b11 == f11) {
            return b11;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(zz.a<? super oa.g> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.home.ContinueBrowsingRepository$loadFromCache$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.home.ContinueBrowsingRepository$loadFromCache$1 r0 = (com.forsale.app.features.categories.home.ContinueBrowsingRepository$loadFromCache$1) r0
            int r1 = r0.f23327d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23327d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.ContinueBrowsingRepository$loadFromCache$1 r0 = new com.forsale.app.features.categories.home.ContinueBrowsingRepository$loadFromCache$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f23325b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f23327d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f23324a
            com.forsale.app.features.categories.home.ContinueBrowsingRepository r2 = (com.forsale.app.features.categories.home.ContinueBrowsingRepository) r2
            kotlin.f.b(r6)
            goto L51
        L3c:
            kotlin.f.b(r6)
            jj.b r6 = r5.f23318a
            com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs r6 = r6.b()
            r0.f23324a = r5
            r0.f23327d = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            oa.f r6 = (oa.f) r6
            r4 = 0
            if (r6 == 0) goto L64
            r0.f23324a = r4
            r0.f23327d = r3
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            r4 = r6
            oa.g r4 = (oa.g) r4
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.ContinueBrowsingRepository.d(zz.a):java.lang.Object");
    }
}
