package com.forsale.app.features.categories.listings.items.promotedPost;

import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PromotedPostItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$hidePromotedPost$1", f = "PromotedPostItemViewModel.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PromotedPostItemViewModel$hidePromotedPost$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30895a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PromotedPostItemViewModel f30896b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItemViewModel$hidePromotedPost$1(PromotedPostItemViewModel promotedPostItemViewModel, zz.a<? super PromotedPostItemViewModel$hidePromotedPost$1> aVar) {
        super(2, aVar);
        this.f30896b = promotedPostItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PromotedPostItemViewModel$hidePromotedPost$1(this.f30896b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        g00.a aVar;
        MutableStateFlow mutableStateFlow;
        f11 = b.f();
        int i11 = this.f30895a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aVar = this.f30896b.f30874j;
            aVar.invoke();
            mutableStateFlow = this.f30896b.f30876y;
            if (mutableStateFlow != null) {
                PromotedPostItemViewModel.PromotedPostState promotedPostState = PromotedPostItemViewModel.PromotedPostState.NOT_SHOWN;
                this.f30895a = 1;
                if (mutableStateFlow.emit(promotedPostState, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PromotedPostItemViewModel$hidePromotedPost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
