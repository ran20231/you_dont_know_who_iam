package com.forsale.app.features.postad.extrainfo;

import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$onPhoneDetected$1$1", f = "PostAdExtraInfoViewModel.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$onPhoneDetected$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35543a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35544b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f35545c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$onPhoneDetected$1$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, String str, zz.a<? super PostAdExtraInfoViewModel$onPhoneDetected$1$1> aVar) {
        super(2, aVar);
        this.f35544b = postAdExtraInfoViewModel;
        this.f35545c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$onPhoneDetected$1$1(this.f35544b, this.f35545c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        boolean D1;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35543a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35544b.f35489q0;
            String str = this.f35545c;
            D1 = this.f35544b.D1(str);
            Pair pair = new Pair(str, kotlin.coroutines.jvm.internal.a.a(D1));
            this.f35543a = 1;
            if (mutableSharedFlow.emit(pair, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$onPhoneDetected$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
