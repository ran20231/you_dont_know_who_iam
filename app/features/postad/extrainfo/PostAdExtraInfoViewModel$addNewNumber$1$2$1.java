package com.forsale.app.features.postad.extrainfo;

import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$addNewNumber$1$2$1", f = "PostAdExtraInfoViewModel.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$addNewNumber$1$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35504a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35505b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f35506c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f35507d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$addNewNumber$1$2$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, String str, boolean z11, zz.a<? super PostAdExtraInfoViewModel$addNewNumber$1$2$1> aVar) {
        super(2, aVar);
        this.f35505b = postAdExtraInfoViewModel;
        this.f35506c = str;
        this.f35507d = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$addNewNumber$1$2$1(this.f35505b, this.f35506c, this.f35507d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35504a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35505b.A0;
            Pair a11 = i.a(this.f35506c, kotlin.coroutines.jvm.internal.a.a(this.f35507d));
            this.f35504a = 1;
            if (mutableSharedFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$addNewNumber$1$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
