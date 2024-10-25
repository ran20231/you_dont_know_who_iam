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
import p1.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeedbackSnackBarComponent.kt */
@d(c = "com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3", f = "FeedbackSnackBarComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37439a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f37440b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ lf.a f37441c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f37442d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f37443e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackSnackBarComponent.kt */
    @d(c = "com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3$1", f = "FeedbackSnackBarComponent.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f37444a;

        /* renamed from: b  reason: collision with root package name */
        int f37445b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ lf.a f37446c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SnackbarHostState f37447d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f37448e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(lf.a aVar, SnackbarHostState snackbarHostState, g00.a<wz.p> aVar2, zz.a<? super AnonymousClass1> aVar3) {
            super(2, aVar3);
            this.f37446c = aVar;
            this.f37447d = snackbarHostState;
            this.f37448e = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f37446c, this.f37447d, this.f37448e, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            g00.a<wz.p> aVar;
            f11 = b.f();
            int i11 = this.f37445b;
            if (i11 != 0) {
                if (i11 == 1) {
                    aVar = (g00.a) this.f37444a;
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                final lf.a aVar2 = this.f37446c;
                SnackbarHostState snackbarHostState = this.f37447d;
                g00.a<wz.p> aVar3 = this.f37448e;
                a.c cVar = a.c.f41995a;
                c a11 = TestTagKt.a(c.f7566a, ComponentsTags.FEED_BACK_SNACK_BAR.getTag());
                r0.a c11 = r0.b.c(-397365468, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar4, int i12) {
                        if ((i12 & 11) == 2 && aVar4.i()) {
                            aVar4.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-397365468, i12, -1, "com.forsale.app.feedback.FeedbackSnackBarComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FeedbackSnackBarComponent.kt:91)");
                        }
                        TextKt.a(lf.a.this.b().a(aVar4, rj.a.f68042a), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar4, 0, 0, 2046);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return wz.p.f75480a;
                    }
                });
                r0.a c12 = r0.b.c(153878370, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3$1$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar4, int i12) {
                        if ((i12 & 11) == 2 && aVar4.i()) {
                            aVar4.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(153878370, i12, -1, "com.forsale.app.feedback.FeedbackSnackBarComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FeedbackSnackBarComponent.kt:96)");
                        }
                        a a12 = lf.a.this.a();
                        if (a12 != null) {
                            if (a12 instanceof a.b) {
                                aVar4.C(236289940);
                                IconKt.a(e.d(((a.b) a12).a(), aVar4, 0), null, null, 0L, false, 0.0f, aVar4, 8, 62);
                                aVar4.S();
                            } else if (a12 instanceof a.C0430a) {
                                aVar4.C(236290132);
                                AnimatedIconKt.a(null, ((a.C0430a) a12).a(), 1.1f, 0.0f, true, null, aVar4, 24960, 41);
                                aVar4.S();
                            } else {
                                aVar4.C(236290502);
                                aVar4.S();
                            }
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return wz.p.f75480a;
                    }
                });
                this.f37444a = aVar3;
                this.f37445b = 1;
                if (SnackbarHostState.e(snackbarHostState, null, null, 0.0f, cVar, c11, a11, c12, null, this, 135, null) == f11) {
                    return f11;
                }
                aVar = aVar3;
            }
            aVar.invoke();
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3(CoroutineScope coroutineScope, lf.a aVar, SnackbarHostState snackbarHostState, g00.a<wz.p> aVar2, zz.a<? super FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3> aVar3) {
        super(2, aVar3);
        this.f37440b = coroutineScope;
        this.f37441c = aVar;
        this.f37442d = snackbarHostState;
        this.f37443e = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3(this.f37440b, this.f37441c, this.f37442d, this.f37443e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f37439a == 0) {
            f.b(obj);
            BuildersKt__Builders_commonKt.launch$default(this.f37440b, null, null, new AnonymousClass1(this.f37441c, this.f37442d, this.f37443e, null), 3, null);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
