package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem;

import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: PreviewCardItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel$loadCategoryNames$1", f = "PreviewCardItemViewModel.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PreviewCardItemViewModel$loadCategoryNames$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27891a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PreviewCardItemViewModel f27892b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCardItemViewModel$loadCategoryNames$1(PreviewCardItemViewModel previewCardItemViewModel, a<? super PreviewCardItemViewModel$loadCategoryNames$1> aVar) {
        super(2, aVar);
        this.f27892b = previewCardItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PreviewCardItemViewModel$loadCategoryNames$1(this.f27892b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27891a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            NewListingDetailsViewModel p11 = this.f27892b.p();
            this.f27891a = 1;
            obj = p11.C2(" - ", this);
            if (obj == f11) {
                return f11;
            }
        }
        String str = (String) obj;
        if (str != null) {
            this.f27892b.i().postValue(str);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PreviewCardItemViewModel$loadCategoryNames$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
