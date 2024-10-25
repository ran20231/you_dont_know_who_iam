package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem;

import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreviewCardItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel$loadItemData$1", f = "PreviewCardItemViewModel.kt", l = {FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PreviewCardItemViewModel$loadItemData$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27900a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PreviewCardItemViewModel f27901b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCardItemViewModel$loadItemData$1(PreviewCardItemViewModel previewCardItemViewModel, a<? super PreviewCardItemViewModel$loadItemData$1> aVar) {
        super(2, aVar);
        this.f27901b = previewCardItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PreviewCardItemViewModel$loadItemData$1(this.f27901b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27900a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            NewListingDetailsViewModel p11 = this.f27901b.p();
            this.f27900a = 1;
            obj = p11.H2(this);
            if (obj == f11) {
                return f11;
            }
        }
        RegionEntity regionEntity = (RegionEntity) obj;
        if (regionEntity != null) {
            PreviewCardItemViewModel previewCardItemViewModel = this.f27901b;
            previewCardItemViewModel.D(regionEntity);
            previewCardItemViewModel.C(regionEntity);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PreviewCardItemViewModel$loadItemData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
