package com.forsale.app.features.maincontainer;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listings.ListingsTypes;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import t9.h0;
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$navigateToListingsRealty$1", f = "MainContainerActivity.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainContainerActivity$navigateToListingsRealty$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31411a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31412b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$navigateToListingsRealty$1(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$navigateToListingsRealty$1> aVar) {
        super(2, aVar);
        this.f31412b = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$navigateToListingsRealty$1(this.f31412b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object B1;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31411a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
                B1 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            this.f31412b.i2(HomeTabs.INDEX_HOME);
            MainContainerViewModel x02 = this.f31412b.x0();
            this.f31411a = 1;
            B1 = x02.B1(this);
            if (B1 == f11) {
                return f11;
            }
        }
        CategoryEntity categoryEntity = (CategoryEntity) B1;
        if (categoryEntity != null) {
            MainContainerActivity mainContainerActivity = this.f31412b;
            mainContainerActivity.q1().d0(h0.c.c(h0.f69222a, ListingsTypes.FOR_SALE_REALTY, null, 0, null, null, null, categoryEntity.getId(), false, 0, 0, null, null, 0, null, 16318, null));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$navigateToListingsRealty$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
