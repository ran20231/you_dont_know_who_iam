package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import jj.b;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: SwipingOverlayInteractor.kt */
/* loaded from: classes2.dex */
public final class SwipingOverlayInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final b f26024a;

    public SwipingOverlayInteractor(b sharedPreferences) {
        o.i(sharedPreferences, "sharedPreferences");
        this.f26024a = sharedPreferences;
    }

    private final Object c(zz.a<? super Boolean> aVar) {
        return this.f26024a.e().b(aVar);
    }

    private final Object d(zz.a<? super Integer> aVar) {
        return this.f26024a.e().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r9 != 5) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(zz.a<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$displaySwipingOverlay$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$displaySwipingOverlay$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$displaySwipingOverlay$1) r0
            int r1 = r0.f26028d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26028d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$displaySwipingOverlay$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$displaySwipingOverlay$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f26026b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f26028d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L54
            if (r2 == r7) goto L4c
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            kotlin.f.b(r9)
            goto La0
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            java.lang.Object r2 = r0.f26025a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor) r2
            kotlin.f.b(r9)
            goto L93
        L44:
            java.lang.Object r2 = r0.f26025a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor) r2
            kotlin.f.b(r9)
            goto L80
        L4c:
            java.lang.Object r2 = r0.f26025a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor) r2
            kotlin.f.b(r9)
            goto L63
        L54:
            kotlin.f.b(r9)
            r0.f26025a = r8
            r0.f26028d = r7
            java.lang.Object r9 = r8.d(r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 == r7) goto L9f
            if (r9 == r6) goto L75
            if (r9 == r5) goto L9f
            if (r9 == r4) goto L75
            r0 = 5
            if (r9 == r0) goto L9f
            goto La0
        L75:
            r0.f26025a = r2
            r0.f26028d = r6
            java.lang.Object r9 = r2.c(r0)
            if (r9 != r1) goto L80
            return r1
        L80:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La0
            r0.f26025a = r2
            r0.f26028d = r5
            java.lang.Object r9 = r2.g(r0)
            if (r9 != r1) goto L93
            return r1
        L93:
            r9 = 0
            r0.f26025a = r9
            r0.f26028d = r4
            java.lang.Object r9 = r2.h(r3, r0)
            if (r9 != r1) goto La0
            return r1
        L9f:
            r3 = r7
        La0:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor.e(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySessionCount$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySessionCount$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySessionCount$1) r0
            int r1 = r0.f26036d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26036d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySessionCount$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySessionCount$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f26034b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f26036d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f26033a
            kj.c r2 = (kj.c) r2
            kotlin.f.b(r6)
            goto L50
        L3c:
            kotlin.f.b(r6)
            jj.b r6 = r5.f26024a
            kj.c r2 = r6.e()
            r0.f26033a = r2
            r0.f26036d = r4
            java.lang.Object r6 = r5.d(r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            int r6 = r6 + r4
            r4 = 0
            r0.f26033a = r4
            r0.f26036d = r3
            java.lang.Object r6 = r2.f(r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor.g(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(zz.a<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$shouldDisplaySwipingOverlay$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$shouldDisplaySwipingOverlay$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$shouldDisplaySwipingOverlay$1) r0
            int r1 = r0.f26032d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26032d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$shouldDisplaySwipingOverlay$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$shouldDisplaySwipingOverlay$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f26030b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f26032d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f26029a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor) r2
            kotlin.f.b(r6)
            goto L4b
        L3c:
            kotlin.f.b(r6)
            r0.f26029a = r5
            r0.f26032d = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L60
            r6 = 0
            r0.f26029a = r6
            r0.f26032d = r3
            java.lang.Object r6 = r2.e(r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            return r6
        L60:
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor.f(zz.a):java.lang.Object");
    }

    public final Object h(boolean z11, zz.a<? super p> aVar) {
        Object f11;
        Object g11 = this.f26024a.e().g(z11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (g11 == f11) {
            return g11;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySettings$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySettings$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySettings$1) r0
            int r1 = r0.f26040d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26040d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySettings$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor$updateSwipingOverlaySettings$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f26038b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f26040d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L58
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f26037a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor) r2
            kotlin.f.b(r6)
            goto L4b
        L3c:
            kotlin.f.b(r6)
            r0.f26037a = r5
            r0.f26040d = r4
            java.lang.Object r6 = r5.g(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f26037a = r6
            r0.f26040d = r3
            r6 = 0
            java.lang.Object r6 = r2.h(r6, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor.i(zz.a):java.lang.Object");
    }
}
