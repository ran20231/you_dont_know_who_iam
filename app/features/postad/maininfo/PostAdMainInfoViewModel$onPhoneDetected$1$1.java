package com.forsale.app.features.postad.maininfo;

import com.forsale.app.utils.validation.PhoneDetectorKt;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMainInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onPhoneDetected$1$1", f = "PostAdMainInfoViewModel.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMainInfoViewModel$onPhoneDetected$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35891a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoViewModel f35892b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f35893c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoViewModel$onPhoneDetected$1$1(PostAdMainInfoViewModel postAdMainInfoViewModel, String str, zz.a<? super PostAdMainInfoViewModel$onPhoneDetected$1$1> aVar) {
        super(2, aVar);
        this.f35892b = postAdMainInfoViewModel;
        this.f35893c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdMainInfoViewModel$onPhoneDetected$1$1(this.f35892b, this.f35893c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35891a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35892b.f35870s0;
            String str = this.f35893c;
            Pair pair = new Pair(str, kotlin.coroutines.jvm.internal.a.a(PhoneDetectorKt.e(str, this.f35892b.S0())));
            this.f35891a = 1;
            if (mutableSharedFlow.emit(pair, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdMainInfoViewModel$onPhoneDetected$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}