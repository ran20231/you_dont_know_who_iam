package com.forsale.app.features.postad.media.mediaScreenViewModel;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* compiled from: PostAdMediaViewModel.kt */
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$handleImageFailure$1", f = "PostAdMediaViewModel.kt", l = {393, 397, 399}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdMediaViewModel$handleImageFailure$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36307a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36308b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$handleImageFailure$1(PostAdMediaViewModel postAdMediaViewModel, a<? super PostAdMediaViewModel$handleImageFailure$1> aVar) {
        super(2, aVar);
        this.f36308b = postAdMediaViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PostAdMediaViewModel$handleImageFailure$1(this.f36308b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f36307a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f36308b.H0().s3()) {
                if (o.d(this.f36308b.H0().c2().getValue(), kotlin.coroutines.jvm.internal.a.a(true))) {
                    MutableSharedFlow<Boolean> e32 = this.f36308b.H0().e3();
                    Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f36308b.H0().w3());
                    this.f36307a = 1;
                    if (e32.emit(a11, this) == f11) {
                        return f11;
                    }
                }
            } else if (this.f36308b.H0().t3()) {
                MutableSharedFlow<Boolean> e33 = this.f36308b.H0().e3();
                Boolean a12 = kotlin.coroutines.jvm.internal.a.a(false);
                this.f36307a = 2;
                if (e33.emit(a12, this) == f11) {
                    return f11;
                }
            } else {
                MutableSharedFlow<Boolean> e34 = this.f36308b.H0().e3();
                Boolean a13 = kotlin.coroutines.jvm.internal.a.a(true);
                this.f36307a = 3;
                if (e34.emit(a13, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PostAdMediaViewModel$handleImageFailure$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
