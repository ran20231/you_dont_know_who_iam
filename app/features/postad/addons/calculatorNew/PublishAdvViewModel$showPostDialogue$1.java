package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$showPostDialogue$1", f = "PublishAdvViewModel.kt", l = {406}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$showPostDialogue$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34664a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34665b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdDialogs f34666c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$showPostDialogue$1(PublishAdvViewModel publishAdvViewModel, PostAdDialogs postAdDialogs, zz.a<? super PublishAdvViewModel$showPostDialogue$1> aVar) {
        super(2, aVar);
        this.f34665b = publishAdvViewModel;
        this.f34666c = postAdDialogs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$showPostDialogue$1(this.f34665b, this.f34666c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        PostAdViewModel postAdViewModel;
        PostAdViewModel postAdViewModel2;
        Integer num;
        List d02;
        f11 = b.f();
        int i11 = this.f34664a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f34665b.f34614t;
            PostAdDialogs postAdDialogs = this.f34666c;
            postAdViewModel = this.f34665b.f34595a;
            boolean y32 = postAdViewModel.y3();
            postAdViewModel2 = this.f34665b.f34595a;
            ListingDetailsEntity n22 = postAdViewModel2.n2();
            if (n22 != null) {
                num = kotlin.coroutines.jvm.internal.a.d(n22.getId());
            } else {
                num = null;
            }
            d02 = this.f34665b.d0();
            com.forsale.app.features.postad.f fVar = new com.forsale.app.features.postad.f(postAdDialogs, y32, num, d02);
            this.f34664a = 1;
            if (mutableSharedFlow.emit(fVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$showPostDialogue$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
