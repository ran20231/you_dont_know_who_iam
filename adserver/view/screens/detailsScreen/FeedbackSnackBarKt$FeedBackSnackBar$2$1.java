package com.forsale.adserver.view.screens.detailsScreen;

import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.notificationsystem.SnackBarAnimationDuration;
import com.forsale.designSystem.notificationsystem.SnackbarDuration;
import com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeedbackSnackBar.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.FeedbackSnackBarKt$FeedBackSnackBar$2$1", f = "FeedbackSnackBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeedbackSnackBarKt$FeedBackSnackBar$2$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21164a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f21165b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f21166c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f21167d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SnackbarDuration f21168e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SnackBarAnimationDuration f21169f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ float f21170g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ com.forsale.designSystem.notificationsystem.a f21171h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ g00.p<androidx.compose.runtime.a, Integer, wz.p> f21172i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Boolean f21173j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ g00.p<androidx.compose.runtime.a, Integer, wz.p> f21174x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f21175y;

    /* renamed from: z  reason: collision with root package name */
    final /* synthetic */ int f21176z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackSnackBar.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.FeedbackSnackBarKt$FeedBackSnackBar$2$1$1", f = "FeedbackSnackBar.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.screens.detailsScreen.FeedbackSnackBarKt$FeedBackSnackBar$2$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f21177a;

        /* renamed from: b  reason: collision with root package name */
        int f21178b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f21179c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SnackbarHostState f21180d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SnackbarDuration f21181e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ SnackBarAnimationDuration f21182f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f21183g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.forsale.designSystem.notificationsystem.a f21184h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g00.p<androidx.compose.runtime.a, Integer, wz.p> f21185i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Boolean f21186j;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ g00.p<androidx.compose.runtime.a, Integer, wz.p> f21187x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f21188y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f21189z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(String str, SnackbarHostState snackbarHostState, SnackbarDuration snackbarDuration, SnackBarAnimationDuration snackBarAnimationDuration, float f11, com.forsale.designSystem.notificationsystem.a aVar, g00.p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, Boolean bool, g00.p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, g00.a<wz.p> aVar2, int i11, zz.a<? super AnonymousClass1> aVar3) {
            super(2, aVar3);
            this.f21179c = str;
            this.f21180d = snackbarHostState;
            this.f21181e = snackbarDuration;
            this.f21182f = snackBarAnimationDuration;
            this.f21183g = f11;
            this.f21184h = aVar;
            this.f21185i = pVar;
            this.f21186j = bool;
            this.f21187x = pVar2;
            this.f21188y = aVar2;
            this.f21189z = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f21179c, this.f21180d, this.f21181e, this.f21182f, this.f21183g, this.f21184h, this.f21185i, this.f21186j, this.f21187x, this.f21188y, this.f21189z, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            g00.a<wz.p> aVar;
            g00.p<androidx.compose.runtime.a, Integer, wz.p> pVar;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f21178b;
            if (i11 != 0) {
                if (i11 == 1) {
                    aVar = (g00.a) this.f21177a;
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                final String str = this.f21179c;
                if (str != null) {
                    SnackbarHostState snackbarHostState = this.f21180d;
                    SnackbarDuration snackbarDuration = this.f21181e;
                    SnackBarAnimationDuration snackBarAnimationDuration = this.f21182f;
                    float f12 = this.f21183g;
                    com.forsale.designSystem.notificationsystem.a aVar2 = this.f21184h;
                    g00.p<androidx.compose.runtime.a, Integer, wz.p> pVar2 = this.f21185i;
                    Boolean bool = this.f21186j;
                    g00.p<androidx.compose.runtime.a, Integer, wz.p> pVar3 = this.f21187x;
                    g00.a<wz.p> aVar3 = this.f21188y;
                    final int i12 = this.f21189z;
                    r0.a c11 = r0.b.c(-857487457, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.FeedbackSnackBarKt$FeedBackSnackBar$2$1$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar4, int i13) {
                            if ((i13 & 11) == 2 && aVar4.i()) {
                                aVar4.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-857487457, i13, -1, "com.forsale.adserver.view.screens.detailsScreen.FeedBackSnackBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FeedbackSnackBar.kt:51)");
                            }
                            TextKt.a(str, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar4, i12 & 14, 0, 2046);
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
                    if (pVar2 == null) {
                        if (kotlin.jvm.internal.o.d(bool, kotlin.coroutines.jvm.internal.a.a(true))) {
                            pVar = ComposableSingletons$FeedbackSnackBarKt.f21133a.a();
                        } else {
                            pVar = null;
                        }
                        pVar2 = pVar;
                    }
                    this.f21177a = aVar3;
                    this.f21178b = 1;
                    if (SnackbarHostState.e(snackbarHostState, snackbarDuration, snackBarAnimationDuration, f12, aVar2, c11, null, pVar2, pVar3, this, 32, null) == f11) {
                        return f11;
                    }
                    aVar = aVar3;
                }
                return wz.p.f75480a;
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
    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackSnackBarKt$FeedBackSnackBar$2$1(CoroutineScope coroutineScope, String str, SnackbarHostState snackbarHostState, SnackbarDuration snackbarDuration, SnackBarAnimationDuration snackBarAnimationDuration, float f11, com.forsale.designSystem.notificationsystem.a aVar, g00.p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, Boolean bool, g00.p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, g00.a<wz.p> aVar2, int i11, zz.a<? super FeedbackSnackBarKt$FeedBackSnackBar$2$1> aVar3) {
        super(2, aVar3);
        this.f21165b = coroutineScope;
        this.f21166c = str;
        this.f21167d = snackbarHostState;
        this.f21168e = snackbarDuration;
        this.f21169f = snackBarAnimationDuration;
        this.f21170g = f11;
        this.f21171h = aVar;
        this.f21172i = pVar;
        this.f21173j = bool;
        this.f21174x = pVar2;
        this.f21175y = aVar2;
        this.f21176z = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FeedbackSnackBarKt$FeedBackSnackBar$2$1(this.f21165b, this.f21166c, this.f21167d, this.f21168e, this.f21169f, this.f21170g, this.f21171h, this.f21172i, this.f21173j, this.f21174x, this.f21175y, this.f21176z, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f21164a == 0) {
            kotlin.f.b(obj);
            BuildersKt__Builders_commonKt.launch$default(this.f21165b, null, null, new AnonymousClass1(this.f21166c, this.f21167d, this.f21168e, this.f21169f, this.f21170g, this.f21171h, this.f21172i, this.f21173j, this.f21174x, this.f21175y, this.f21176z, null), 3, null);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FeedbackSnackBarKt$FeedBackSnackBar$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
