package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$finishEditing$1", f = "PublishAdvViewModel.kt", l = {418}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$finishEditing$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34623a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34624b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f34625c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$finishEditing$1(PublishAdvViewModel publishAdvViewModel, boolean z11, zz.a<? super PublishAdvViewModel$finishEditing$1> aVar) {
        super(2, aVar);
        this.f34624b = publishAdvViewModel;
        this.f34625c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$finishEditing$1(this.f34624b, this.f34625c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        PostAdViewModel postAdViewModel;
        f11 = b.f();
        int i11 = this.f34623a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f34624b.f34612r;
            postAdViewModel = this.f34624b.f34595a;
            PublishAdvViewModel.a aVar = new PublishAdvViewModel.a(postAdViewModel.H4(), this.f34625c);
            this.f34623a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$finishEditing$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
