package com.forsale.app.feedback;

import androidx.compose.ui.c;
import androidx.compose.ui.platform.TestTagKt;
import com.forsale.app.features.auth.utils.ComponentsTags;
import com.forsale.app.feedback.a;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.notificationsystem.a;
import com.forsale.ui.components.AnimatedIconKt;
import com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import p1.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeedbackSnackBarComponent.kt */
@d(c = "com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1", f = "FeedbackSnackBarComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37423a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f37424b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SharedFlow<lf.a> f37425c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f37426d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackSnackBarComponent.kt */
    @d(c = "com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1$1", f = "FeedbackSnackBarComponent.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SharedFlow<lf.a> f37428b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SnackbarHostState f37429c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FeedbackSnackBarComponent.kt */
        @d(c = "com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1$1$1", f = "FeedbackSnackBarComponent.kt", l = {45}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04281 extends SuspendLambda implements p<lf.a, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f37430a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f37431b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ SnackbarHostState f37432c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04281(SnackbarHostState snackbarHostState, zz.a<? super C04281> aVar) {
                super(2, aVar);
                this.f37432c = snackbarHostState;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(lf.a aVar, zz.a<? super wz.p> aVar2) {
                return ((C04281) create(aVar, aVar2)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C04281 c04281 = new C04281(this.f37432c, aVar);
                c04281.f37431b = obj;
                return c04281;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object f11;
                f11 = b.f();
                int i11 = this.f37430a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        f.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    f.b(obj);
                    final lf.a aVar = (lf.a) this.f37431b;
                    a.c cVar = a.c.f41995a;
                    c a11 = TestTagKt.a(c.f7566a, ComponentsTags.FEED_BACK_SNACK_BAR.getTag());
                    SnackbarHostState snackbarHostState = this.f37432c;
                    r0.a c11 = r0.b.c(-13480371, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.feedback.FeedbackSnackBarComponentKt.FeedbackSnackBarComponent.1.1.1.1
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-13480371, i12, -1, "com.forsale.app.feedback.FeedbackSnackBarComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FeedbackSnackBarComponent.kt:45)");
                            }
                            TextKt.a(lf.a.this.b().a(aVar2, rj.a.f68042a), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar2, 0, 0, 2046);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                    r0.a c12 = r0.b.c(-621195441, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.feedback.FeedbackSnackBarComponentKt.FeedbackSnackBarComponent.1.1.1.2
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-621195441, i12, -1, "com.forsale.app.feedback.FeedbackSnackBarComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FeedbackSnackBarComponent.kt:50)");
                            }
                            a a12 = lf.a.this.a();
                            if (a12 != null) {
                                if (a12 instanceof a.b) {
                                    aVar2.C(236288380);
                                    IconKt.a(e.d(((a.b) a12).a(), aVar2, 0), null, null, 0L, false, 0.0f, aVar2, 8, 62);
                                    aVar2.S();
                                } else if (a12 instanceof a.C0430a) {
                                    aVar2.C(236288560);
                                    AnimatedIconKt.a(null, ((a.C0430a) a12).a(), 1.3f, 0.0f, true, null, aVar2, 24960, 41);
                                    aVar2.S();
                                } else {
                                    aVar2.C(236288902);
                                    aVar2.S();
                                }
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                    this.f37430a = 1;
                    if (SnackbarHostState.e(snackbarHostState, null, null, 0.0f, cVar, c11, a11, c12, null, this, 135, null) == f11) {
                        return f11;
                    }
                }
                return wz.p.f75480a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SharedFlow<lf.a> sharedFlow, SnackbarHostState snackbarHostState, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f37428b = sharedFlow;
            this.f37429c = snackbarHostState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f37428b, this.f37429c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f37427a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<lf.a> sharedFlow = this.f37428b;
                C04281 c04281 = new C04281(this.f37429c, null);
                this.f37427a = 1;
                if (FlowKt.collectLatest(sharedFlow, c04281, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1(CoroutineScope coroutineScope, SharedFlow<lf.a> sharedFlow, SnackbarHostState snackbarHostState, zz.a<? super FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1> aVar) {
        super(2, aVar);
        this.f37424b = coroutineScope;
        this.f37425c = sharedFlow;
        this.f37426d = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1(this.f37424b, this.f37425c, this.f37426d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f37423a == 0) {
            f.b(obj);
            BuildersKt__Builders_commonKt.launch$default(this.f37424b, null, null, new AnonymousClass1(this.f37425c, this.f37426d, null), 3, null);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
