package com.forsale.app.features.categories.home.allverticals;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$logHomeScreenVisited$1", f = "AllVerticalsViewModel.kt", l = {415}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$logHomeScreenVisited$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23456a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23457b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$logHomeScreenVisited$1(AllVerticalsViewModel allVerticalsViewModel, zz.a<? super AllVerticalsViewModel$logHomeScreenVisited$1> aVar) {
        super(2, aVar);
        this.f23457b = allVerticalsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AllVerticalsViewModel$logHomeScreenVisited$1(this.f23457b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        pa.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23456a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            aVar = this.f23457b.f23386e;
            CategoryEntity Q = this.f23457b.Q();
            HomeVisitedSources O = this.f23457b.O();
            this.f23456a = 1;
            if (aVar.d(Q, O, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AllVerticalsViewModel$logHomeScreenVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
