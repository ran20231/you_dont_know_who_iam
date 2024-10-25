package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo;

import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBase;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainInfoItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo.MainInfoItemViewModel$loadItemData$1$1", f = "MainInfoItemViewModel.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainInfoItemViewModel$loadItemData$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27560a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainInfoItemViewModel f27561b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingItemBase f27562c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainInfoItemViewModel$loadItemData$1$1(MainInfoItemViewModel mainInfoItemViewModel, ListingItemBase listingItemBase, a<? super MainInfoItemViewModel$loadItemData$1$1> aVar) {
        super(2, aVar);
        this.f27561b = mainInfoItemViewModel;
        this.f27562c = listingItemBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new MainInfoItemViewModel$loadItemData$1$1(this.f27561b, this.f27562c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27560a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MainInfoItemViewModel mainInfoItemViewModel = this.f27561b;
            int regId = this.f27562c.getRegId();
            this.f27560a = 1;
            obj = mainInfoItemViewModel.m(regId, this);
            if (obj == f11) {
                return f11;
            }
        }
        RegionEntity regionEntity = (RegionEntity) obj;
        if (regionEntity != null) {
            MainInfoItemViewModel mainInfoItemViewModel2 = this.f27561b;
            ListingItemBase listingItemBase = this.f27562c;
            mainInfoItemViewModel2.q(listingItemBase, regionEntity);
            mainInfoItemViewModel2.p(listingItemBase, regionEntity);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((MainInfoItemViewModel$loadItemData$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
