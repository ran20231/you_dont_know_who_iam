package com.forsale.app.features.postad.extrainfo;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$hideNumberClicked$1$1", f = "PostAdExtraInfoViewModel.kt", l = {235}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$hideNumberClicked$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35534a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35535b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f35536c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$hideNumberClicked$1$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, boolean z11, zz.a<? super PostAdExtraInfoViewModel$hideNumberClicked$1$1> aVar) {
        super(2, aVar);
        this.f35535b = postAdExtraInfoViewModel;
        this.f35536c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$hideNumberClicked$1$1(this.f35535b, this.f35536c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35534a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35535b.f35494v0;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f35536c);
            this.f35534a = 1;
            if (mutableSharedFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$hideNumberClicked$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
