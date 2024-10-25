package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$hotZones$5$1$1", f = "VerticalViewModel.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$setHomeSectionsViewModels$hotZones$5$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24065a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24066b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f24067c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$setHomeSectionsViewModels$hotZones$5$1$1(VerticalViewModel verticalViewModel, CategoryEntity categoryEntity, zz.a<? super VerticalViewModel$setHomeSectionsViewModels$hotZones$5$1$1> aVar) {
        super(2, aVar);
        this.f24066b = verticalViewModel;
        this.f24067c = categoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$setHomeSectionsViewModels$hotZones$5$1$1(this.f24066b, this.f24067c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24065a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f24066b.X0;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f24067c.getId());
            this.f24065a = 1;
            if (mutableSharedFlow.emit(d11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalViewModel$setHomeSectionsViewModels$hotZones$5$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
