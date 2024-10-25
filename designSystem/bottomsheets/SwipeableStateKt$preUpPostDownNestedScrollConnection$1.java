package com.forsale.designSystem.bottomsheets;

import a1.f;
import a1.g;
import k1.a;
import k1.b;
import wz.p;
/* compiled from: SwipeableState.kt */
/* loaded from: classes3.dex */
public final class SwipeableStateKt$preUpPostDownNestedScrollConnection$1 implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40954a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f40955b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SwipeableStateKt$preUpPostDownNestedScrollConnection$1(SwipeableState<T> swipeableState, g00.a<p> aVar) {
        this.f40954a = swipeableState;
        this.f40955b = aVar;
    }

    private final float a(long j11) {
        return f.p(j11);
    }

    private final long b(float f11) {
        return g.a(0.0f, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // k1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(long r8, zz.a<? super e2.x> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.f40963d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40963d = r1
            goto L18
        L13:
            com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPreFling$1
            r0.<init>(r7, r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.f40961b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f40963d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            long r8 = r4.f40960a
            kotlin.f.b(r10)
            goto L7d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.f.b(r10)
            float r10 = e2.x.h(r8)
            float r1 = e2.x.i(r8)
            long r5 = a1.g.a(r10, r1)
            float r10 = r7.a(r5)
            r1 = 0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 >= 0) goto L77
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r1 = r7.f40954a
            j0.n1 r1 = r1.s()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r3 = r7.f40954a
            float r3 = r3.r()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L77
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r1 = r7.f40954a
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f40960a = r8
            r4.f40963d = r2
            r2 = r10
            java.lang.Object r10 = com.forsale.designSystem.bottomsheets.SwipeableState.A(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L7d
            return r0
        L77:
            e2.x$a r8 = e2.x.f54591b
            long r8 = r8.a()
        L7d:
            e2.x r8 = e2.x.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1.G(long, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // k1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b0(long r5, long r7, zz.a<? super e2.x> r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r5 == 0) goto L13
            r5 = r9
            com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = (com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPostFling$1) r5
            int r6 = r5.f40959d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.f40959d = r6
            goto L18
        L13:
            com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = new com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPostFling$1
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r6 = r5.f40957b
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r5.f40959d
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r7 = r5.f40956a
            kotlin.f.b(r6)
            goto L55
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.f.b(r6)
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r6 = r4.f40954a
            float r0 = e2.x.h(r7)
            float r2 = e2.x.i(r7)
            long r2 = a1.g.a(r0, r2)
            float r0 = r4.a(r2)
            g00.a<wz.p> r2 = r4.f40955b
            r5.f40956a = r7
            r5.f40959d = r1
            java.lang.Object r5 = r6.z(r0, r2, r5)
            if (r5 != r9) goto L55
            return r9
        L55:
            e2.x r5 = e2.x.b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1.b0(long, long, zz.a):java.lang.Object");
    }

    @Override // k1.a
    public long e1(long j11, int i11) {
        float a11 = a(j11);
        if (a11 < 0.0f && b.e(i11, b.f60926a.a())) {
            return b(this.f40954a.y(a11));
        }
        return f.f62b.c();
    }

    @Override // k1.a
    public long y0(long j11, long j12, int i11) {
        if (b.e(i11, b.f60926a.a())) {
            return b(this.f40954a.y(a(j12)));
        }
        return f.f62b.c();
    }
}
