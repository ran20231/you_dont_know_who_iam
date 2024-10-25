package com.forsale.designSystem.bottomsheets;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.saveable.SaverKt;
import g00.l;
import j0.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import r.f;
import s0.b;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
public final class ModalBottomSheetState extends SwipeableState<ModalBottomSheetValue> {

    /* renamed from: t  reason: collision with root package name */
    public static final Companion f40865t = new Companion(null);

    /* renamed from: r  reason: collision with root package name */
    private final boolean f40866r;

    /* renamed from: s  reason: collision with root package name */
    private final k0 f40867s;

    /* compiled from: BottomSheets.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<ModalBottomSheetState, ?> a(f<Float> animationSpec, boolean z11, l<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
            o.i(animationSpec, "animationSpec");
            o.i(confirmStateChange, "confirmStateChange");
            return SaverKt.a(ModalBottomSheetState$Companion$Saver$1.f40868a, new ModalBottomSheetState$Companion$Saver$2(animationSpec, z11, confirmStateChange));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(ModalBottomSheetValue initialValue, f<Float> animationSpec, boolean z11, l<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        super(initialValue, animationSpec, confirmStateChange);
        boolean z12;
        k0 e11;
        o.i(initialValue, "initialValue");
        o.i(animationSpec, "animationSpec");
        o.i(confirmStateChange, "confirmStateChange");
        this.f40866r = z11;
        if (o() != ModalBottomSheetValue.Hidden) {
            z12 = true;
        } else {
            z12 = false;
        }
        e11 = c0.e(Boolean.valueOf(z12), null, 2, null);
        this.f40867s = e11;
        if (z11) {
            if (!(initialValue != ModalBottomSheetValue.HalfExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
    }

    private final void P(boolean z11) {
        this.f40867s.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(zz.a<? super wz.p> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.designSystem.bottomsheets.ModalBottomSheetState$expand$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState$expand$1 r0 = (com.forsale.designSystem.bottomsheets.ModalBottomSheetState$expand$1) r0
            int r1 = r0.f40875d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40875d = r1
            goto L18
        L13:
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState$expand$1 r0 = new com.forsale.designSystem.bottomsheets.ModalBottomSheetState$expand$1
            r0.<init>(r7, r8)
        L18:
            r4 = r0
            java.lang.Object r8 = r4.f40873b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f40875d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r0 = r4.f40872a
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState r0 = (com.forsale.designSystem.bottomsheets.ModalBottomSheetState) r0
            kotlin.f.b(r8)
            goto L4c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.f.b(r8)
            com.forsale.designSystem.bottomsheets.ModalBottomSheetValue r8 = com.forsale.designSystem.bottomsheets.ModalBottomSheetValue.Expanded
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f40872a = r7
            r4.f40875d = r2
            r1 = r7
            r2 = r8
            java.lang.Object r8 = com.forsale.designSystem.bottomsheets.SwipeableState.j(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            r0 = r7
        L4c:
            r0.R()
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.ModalBottomSheetState.J(zz.a):java.lang.Object");
    }

    public final boolean K() {
        return l().values().contains(ModalBottomSheetValue.HalfExpanded);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(zz.a<? super wz.p> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.designSystem.bottomsheets.ModalBottomSheetState$halfExpand$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState$halfExpand$1 r0 = (com.forsale.designSystem.bottomsheets.ModalBottomSheetState$halfExpand$1) r0
            int r1 = r0.f40879d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40879d = r1
            goto L18
        L13:
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState$halfExpand$1 r0 = new com.forsale.designSystem.bottomsheets.ModalBottomSheetState$halfExpand$1
            r0.<init>(r7, r8)
        L18:
            r4 = r0
            java.lang.Object r8 = r4.f40877b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f40879d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r0 = r4.f40876a
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState r0 = (com.forsale.designSystem.bottomsheets.ModalBottomSheetState) r0
            kotlin.f.b(r8)
            goto L55
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.f.b(r8)
            boolean r8 = r7.K()
            if (r8 != 0) goto L42
            wz.p r8 = wz.p.f75480a
            return r8
        L42:
            com.forsale.designSystem.bottomsheets.ModalBottomSheetValue r8 = com.forsale.designSystem.bottomsheets.ModalBottomSheetValue.HalfExpanded
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f40876a = r7
            r4.f40879d = r2
            r1 = r7
            r2 = r8
            java.lang.Object r8 = com.forsale.designSystem.bottomsheets.SwipeableState.j(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L54
            return r0
        L54:
            r0 = r7
        L55:
            r0.R()
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.ModalBottomSheetState.L(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(zz.a<? super wz.p> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.designSystem.bottomsheets.ModalBottomSheetState$hide$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState$hide$1 r0 = (com.forsale.designSystem.bottomsheets.ModalBottomSheetState$hide$1) r0
            int r1 = r0.f40883d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40883d = r1
            goto L18
        L13:
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState$hide$1 r0 = new com.forsale.designSystem.bottomsheets.ModalBottomSheetState$hide$1
            r0.<init>(r7, r8)
        L18:
            r4 = r0
            java.lang.Object r8 = r4.f40881b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f40883d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r0 = r4.f40880a
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState r0 = (com.forsale.designSystem.bottomsheets.ModalBottomSheetState) r0
            kotlin.f.b(r8)
            goto L4c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.f.b(r8)
            com.forsale.designSystem.bottomsheets.ModalBottomSheetValue r8 = com.forsale.designSystem.bottomsheets.ModalBottomSheetValue.Hidden
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f40880a = r7
            r4.f40883d = r2
            r1 = r7
            r2 = r8
            java.lang.Object r8 = com.forsale.designSystem.bottomsheets.SwipeableState.j(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            r0 = r7
        L4c:
            r0.R()
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.ModalBottomSheetState.M(zz.a):java.lang.Object");
    }

    public final boolean N() {
        return this.f40866r;
    }

    public final boolean O() {
        return ((Boolean) this.f40867s.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(zz.a<? super wz.p> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.designSystem.bottomsheets.ModalBottomSheetState$show$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState$show$1 r0 = (com.forsale.designSystem.bottomsheets.ModalBottomSheetState$show$1) r0
            int r1 = r0.f40887d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40887d = r1
            goto L18
        L13:
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState$show$1 r0 = new com.forsale.designSystem.bottomsheets.ModalBottomSheetState$show$1
            r0.<init>(r7, r8)
        L18:
            r4 = r0
            java.lang.Object r8 = r4.f40885b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f40887d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r0 = r4.f40884a
            com.forsale.designSystem.bottomsheets.ModalBottomSheetState r0 = (com.forsale.designSystem.bottomsheets.ModalBottomSheetState) r0
            kotlin.f.b(r8)
            goto L55
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.f.b(r8)
            boolean r8 = r7.K()
            if (r8 == 0) goto L42
            com.forsale.designSystem.bottomsheets.ModalBottomSheetValue r8 = com.forsale.designSystem.bottomsheets.ModalBottomSheetValue.HalfExpanded
            goto L44
        L42:
            com.forsale.designSystem.bottomsheets.ModalBottomSheetValue r8 = com.forsale.designSystem.bottomsheets.ModalBottomSheetValue.Expanded
        L44:
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f40884a = r7
            r4.f40887d = r2
            r1 = r7
            r2 = r8
            java.lang.Object r8 = com.forsale.designSystem.bottomsheets.SwipeableState.j(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L54
            return r0
        L54:
            r0 = r7
        L55:
            r0.R()
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.ModalBottomSheetState.Q(zz.a):java.lang.Object");
    }

    public final void R() {
        boolean z11;
        if (o() != ModalBottomSheetValue.Hidden) {
            z11 = true;
        } else {
            z11 = false;
        }
        P(z11);
    }
}
