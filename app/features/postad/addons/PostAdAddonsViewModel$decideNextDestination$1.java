package com.forsale.app.features.postad.addons;

import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.models.CalculatorEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$decideNextDestination$1", f = "PostAdAddonsViewModel.kt", l = {425, 426, 428}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$decideNextDestination$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34337a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34338b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$decideNextDestination$1(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super PostAdAddonsViewModel$decideNextDestination$1> aVar) {
        super(2, aVar);
        this.f34338b = postAdAddonsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsViewModel$decideNextDestination$1(this.f34338b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        MutableSharedFlow mutableSharedFlow3;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34337a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (!this.f34338b.e1().q3() || this.f34338b.e1().k2() == PostListingIntention.RE_POST) {
                mutableSharedFlow = this.f34338b.P0;
                wz.p pVar = wz.p.f75480a;
                this.f34337a = 3;
                if (mutableSharedFlow.emit(pVar, this) == f11) {
                    return f11;
                }
            } else {
                CalculatorEntity value = this.f34338b.e1().a2().getValue();
                if (value != null) {
                    PostAdAddonsViewModel postAdAddonsViewModel = this.f34338b;
                    if (value.c().isEmpty()) {
                        mutableSharedFlow3 = postAdAddonsViewModel.N0;
                        wz.p pVar2 = wz.p.f75480a;
                        this.f34337a = 1;
                        if (mutableSharedFlow3.emit(pVar2, this) == f11) {
                            return f11;
                        }
                    } else {
                        mutableSharedFlow2 = postAdAddonsViewModel.P0;
                        wz.p pVar3 = wz.p.f75480a;
                        this.f34337a = 2;
                        if (mutableSharedFlow2.emit(pVar3, this) == f11) {
                            return f11;
                        }
                    }
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsViewModel$decideNextDestination$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
