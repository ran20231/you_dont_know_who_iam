package com.forsale.app.features.postad.addons.featured.selector;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeaturedAddonsSelectorViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorViewModel$logAnalytics$1", f = "FeaturedAddonsSelectorViewModel.kt", l = {86, 82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeaturedAddonsSelectorViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34769a;

    /* renamed from: b  reason: collision with root package name */
    Object f34770b;

    /* renamed from: c  reason: collision with root package name */
    Object f34771c;

    /* renamed from: d  reason: collision with root package name */
    Object f34772d;

    /* renamed from: e  reason: collision with root package name */
    int f34773e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonsSelectorViewModel f34774f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ CreateEditAdvActionType f34775g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f34776h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ boolean f34777i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonsSelectorViewModel$logAnalytics$1(FeaturedAddonsSelectorViewModel featuredAddonsSelectorViewModel, CreateEditAdvActionType createEditAdvActionType, String str, boolean z11, zz.a<? super FeaturedAddonsSelectorViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f34774f = featuredAddonsSelectorViewModel;
        this.f34775g = createEditAdvActionType;
        this.f34776h = str;
        this.f34777i = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FeaturedAddonsSelectorViewModel$logAnalytics$1(this.f34774f, this.f34775g, this.f34776h, this.f34777i, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger r11;
        CreateEditAdvActionType createEditAdvActionType;
        ListingDetailsEntity listingDetailsEntity;
        UserEntity value;
        Object x32;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34773e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createEditAdvActionType = (CreateEditAdvActionType) this.f34770b;
            f.b(obj);
            value = (UserEntity) this.f34772d;
            r11 = (AggregatedAllAnalyticsLogger) this.f34769a;
            listingDetailsEntity = (ListingDetailsEntity) this.f34771c;
            x32 = obj;
        } else {
            f.b(obj);
            r11 = this.f34774f.r();
            createEditAdvActionType = this.f34775g;
            listingDetailsEntity = this.f34774f.f34757k0;
            value = this.f34774f.E0().a3().getValue();
            PostAdViewModel E0 = this.f34774f.E0();
            this.f34769a = r11;
            this.f34770b = createEditAdvActionType;
            this.f34771c = listingDetailsEntity;
            this.f34772d = value;
            this.f34773e = 1;
            x32 = E0.x3(this);
            if (x32 == f11) {
                return f11;
            }
        }
        boolean booleanValue = ((Boolean) x32).booleanValue();
        String str = this.f34776h;
        boolean z11 = this.f34777i;
        this.f34769a = null;
        this.f34770b = null;
        this.f34771c = null;
        this.f34772d = null;
        this.f34773e = 2;
        if (AggregatedAllAnalyticsLoggerKt.M(r11, createEditAdvActionType, listingDetailsEntity, value, booleanValue, str, null, null, null, z11, this, 224, null) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FeaturedAddonsSelectorViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
