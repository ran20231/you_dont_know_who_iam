package com.forsale.app.features.postad;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$updateProgress$1", f = "PostAdViewModel.kt", l = {1218}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$updateProgress$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34190a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f34191b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34192c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f34193d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$updateProgress$1(String str, PostAdViewModel postAdViewModel, int i11, zz.a<? super PostAdViewModel$updateProgress$1> aVar) {
        super(2, aVar);
        this.f34191b = str;
        this.f34192c = postAdViewModel;
        this.f34193d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$updateProgress$1(this.f34191b, this.f34192c, this.f34193d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34190a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            if (o.d(this.f34191b, "IMAGES")) {
                mutableSharedFlow = this.f34192c.N1;
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f34193d);
                this.f34190a = 1;
                if (mutableSharedFlow.emit(d11, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }
        int i12 = this.f34193d;
        x10.a.b("UPLOAD_MEDIA::Progress::3 " + i12, new Object[0]);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$updateProgress$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
