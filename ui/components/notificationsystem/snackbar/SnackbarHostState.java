package com.forsale.ui.components.notificationsystem.snackbar;

import ak.a;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import com.forsale.designSystem.notificationsystem.SnackBarAnimationDuration;
import com.forsale.designSystem.notificationsystem.SnackbarDuration;
import com.forsale.designSystem.notificationsystem.SnackbarResult;
import e2.h;
import g00.p;
import j0.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: SnackbarHost.kt */
/* loaded from: classes3.dex */
public final class SnackbarHostState {

    /* renamed from: a  reason: collision with root package name */
    private final Mutex f42727a = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: b  reason: collision with root package name */
    private final k0 f42728b;

    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes3.dex */
    public static final class SnackbarDataImpl implements a {

        /* renamed from: a  reason: collision with root package name */
        private final c f42729a;

        /* renamed from: b  reason: collision with root package name */
        private final SnackbarDuration f42730b;

        /* renamed from: c  reason: collision with root package name */
        private final CancellableContinuation<SnackbarResult> f42731c;

        /* renamed from: d  reason: collision with root package name */
        private final com.forsale.designSystem.notificationsystem.a f42732d;

        /* renamed from: e  reason: collision with root package name */
        private final float f42733e;

        /* renamed from: f  reason: collision with root package name */
        private final p<androidx.compose.runtime.a, Integer, wz.p> f42734f;

        /* renamed from: g  reason: collision with root package name */
        private final p<androidx.compose.runtime.a, Integer, wz.p> f42735g;

        /* renamed from: h  reason: collision with root package name */
        private final p<androidx.compose.runtime.a, Integer, wz.p> f42736h;

        /* renamed from: i  reason: collision with root package name */
        private final SnackBarAnimationDuration f42737i;

        public /* synthetic */ SnackbarDataImpl(c cVar, SnackbarDuration snackbarDuration, CancellableContinuation cancellableContinuation, com.forsale.designSystem.notificationsystem.a aVar, float f11, p pVar, p pVar2, p pVar3, SnackBarAnimationDuration snackBarAnimationDuration, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, snackbarDuration, cancellableContinuation, aVar, f11, pVar, pVar2, pVar3, snackBarAnimationDuration);
        }

        @Override // ak.a
        public c b() {
            return this.f42729a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // ak.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object c(int r5, zz.a<? super wz.p> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState$SnackbarDataImpl$dismiss$1
                if (r0 == 0) goto L13
                r0 = r6
                com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState$SnackbarDataImpl$dismiss$1 r0 = (com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState$SnackbarDataImpl$dismiss$1) r0
                int r1 = r0.f42741d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f42741d = r1
                goto L18
            L13:
                com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState$SnackbarDataImpl$dismiss$1 r0 = new com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState$SnackbarDataImpl$dismiss$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f42739b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f42741d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f42738a
                com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState$SnackbarDataImpl r5 = (com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState.SnackbarDataImpl) r5
                kotlin.f.b(r6)
                goto L54
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.f.b(r6)
                kotlinx.coroutines.CancellableContinuation<com.forsale.designSystem.notificationsystem.SnackbarResult> r6 = r4.f42731c
                boolean r6 = r6.isActive()
                if (r6 == 0) goto L61
                q00.a$a r6 = q00.a.f66227b
                kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.MILLISECONDS
                long r5 = q00.c.h(r5, r6)
                r0.f42738a = r4
                r0.f42741d = r3
                java.lang.Object r5 = kotlinx.coroutines.DelayKt.m16delayVtjQ1oo(r5, r0)
                if (r5 != r1) goto L53
                return r1
            L53:
                r5 = r4
            L54:
                kotlinx.coroutines.CancellableContinuation<com.forsale.designSystem.notificationsystem.SnackbarResult> r5 = r5.f42731c
                kotlin.Result$a r6 = kotlin.Result.f61613b
                com.forsale.designSystem.notificationsystem.SnackbarResult r6 = com.forsale.designSystem.notificationsystem.SnackbarResult.Dismissed
                java.lang.Object r6 = kotlin.Result.b(r6)
                r5.resumeWith(r6)
            L61:
                wz.p r5 = wz.p.f75480a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState.SnackbarDataImpl.c(int, zz.a):java.lang.Object");
        }

        @Override // ak.a
        public com.forsale.designSystem.notificationsystem.a d() {
            return this.f42732d;
        }

        @Override // ak.a
        public SnackBarAnimationDuration e() {
            return this.f42737i;
        }

        @Override // ak.a
        public p<androidx.compose.runtime.a, Integer, wz.p> f() {
            return this.f42736h;
        }

        @Override // ak.a
        public p<androidx.compose.runtime.a, Integer, wz.p> g() {
            return this.f42735g;
        }

        @Override // ak.a
        public SnackbarDuration getDuration() {
            return this.f42730b;
        }

        @Override // ak.a
        public p<androidx.compose.runtime.a, Integer, wz.p> h() {
            return this.f42734f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SnackbarDataImpl(c modifier, SnackbarDuration duration, CancellableContinuation<? super SnackbarResult> continuation, com.forsale.designSystem.notificationsystem.a style, float f11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> body, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, SnackBarAnimationDuration animationDuration) {
            o.i(modifier, "modifier");
            o.i(duration, "duration");
            o.i(continuation, "continuation");
            o.i(style, "style");
            o.i(body, "body");
            o.i(animationDuration, "animationDuration");
            this.f42729a = modifier;
            this.f42730b = duration;
            this.f42731c = continuation;
            this.f42732d = style;
            this.f42733e = f11;
            this.f42734f = body;
            this.f42735g = pVar;
            this.f42736h = pVar2;
            this.f42737i = animationDuration;
        }
    }

    public SnackbarHostState() {
        k0 e11;
        e11 = c0.e(null, null, 2, null);
        this.f42728b = e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(a aVar) {
        this.f42728b.setValue(aVar);
    }

    public static /* synthetic */ Object e(SnackbarHostState snackbarHostState, SnackbarDuration snackbarDuration, SnackBarAnimationDuration snackBarAnimationDuration, float f11, com.forsale.designSystem.notificationsystem.a aVar, p pVar, c cVar, p pVar2, p pVar3, zz.a aVar2, int i11, Object obj) {
        SnackbarDuration snackbarDuration2;
        SnackBarAnimationDuration snackBarAnimationDuration2;
        float f12;
        c.a aVar3;
        p pVar4;
        p pVar5;
        if ((i11 & 1) != 0) {
            snackbarDuration2 = SnackbarDuration.Four;
        } else {
            snackbarDuration2 = snackbarDuration;
        }
        if ((i11 & 2) != 0) {
            snackBarAnimationDuration2 = SnackBarAnimationDuration.FiveHundredMillis;
        } else {
            snackBarAnimationDuration2 = snackBarAnimationDuration;
        }
        if ((i11 & 4) != 0) {
            f12 = h.l(5);
        } else {
            f12 = f11;
        }
        if ((i11 & 32) != 0) {
            aVar3 = c.f7566a;
        } else {
            aVar3 = cVar;
        }
        if ((i11 & 64) != 0) {
            pVar4 = null;
        } else {
            pVar4 = pVar2;
        }
        if ((i11 & 128) != 0) {
            pVar5 = null;
        } else {
            pVar5 = pVar3;
        }
        return snackbarHostState.d(snackbarDuration2, snackBarAnimationDuration2, f12, aVar, pVar, aVar3, pVar4, pVar5, aVar2);
    }

    public final a b() {
        return (a) this.f42728b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122 A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #0 {all -> 0x0132, blocks: (B:24:0x00d5, B:26:0x0122), top: B:42:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.forsale.designSystem.notificationsystem.SnackbarDuration r29, com.forsale.designSystem.notificationsystem.SnackBarAnimationDuration r30, float r31, com.forsale.designSystem.notificationsystem.a r32, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r33, androidx.compose.ui.c r34, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r35, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r36, zz.a<? super com.forsale.designSystem.notificationsystem.SnackbarResult> r37) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState.d(com.forsale.designSystem.notificationsystem.SnackbarDuration, com.forsale.designSystem.notificationsystem.SnackBarAnimationDuration, float, com.forsale.designSystem.notificationsystem.a, g00.p, androidx.compose.ui.c, g00.p, g00.p, zz.a):java.lang.Object");
    }
}
