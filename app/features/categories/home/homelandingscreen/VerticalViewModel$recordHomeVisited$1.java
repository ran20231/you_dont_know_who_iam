package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$recordHomeVisited$1", f = "VerticalViewModel.kt", l = {458}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$recordHomeVisited$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24057a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24058b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f24059c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$recordHomeVisited$1(VerticalViewModel verticalViewModel, CategoryEntity categoryEntity, zz.a<? super VerticalViewModel$recordHomeVisited$1> aVar) {
        super(2, aVar);
        this.f24058b = verticalViewModel;
        this.f24059c = categoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$recordHomeVisited$1(this.f24058b, this.f24059c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        VerticalRepository verticalRepository;
        HomeVisitedSources B1;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24057a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            verticalRepository = this.f24058b.f23948l0;
            CategoryEntity categoryEntity = this.f24059c;
            B1 = this.f24058b.B1();
            this.f24057a = 1;
            if (verticalRepository.h(categoryEntity, B1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalViewModel$recordHomeVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
