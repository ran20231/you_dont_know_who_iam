package com.forsale.app.features.categories.listingdetails.newui;

import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.draftItem.DraftCardViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kr.m;
import lr.c;
import xb.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$9", f = "NewListingDetailsFragment.kt", l = {719}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsFragment$addToView$9 extends SuspendLambda implements p<CoroutineScope, zz.a<? super c<m<?>, m<?>>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f27033a;

    /* renamed from: b  reason: collision with root package name */
    Object f27034b;

    /* renamed from: c  reason: collision with root package name */
    Object f27035c;

    /* renamed from: d  reason: collision with root package name */
    Object f27036d;

    /* renamed from: e  reason: collision with root package name */
    Object f27037e;

    /* renamed from: f  reason: collision with root package name */
    Object f27038f;

    /* renamed from: g  reason: collision with root package name */
    Object f27039g;

    /* renamed from: h  reason: collision with root package name */
    int f27040h;

    /* renamed from: i  reason: collision with root package name */
    int f27041i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsFragment f27042j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ b.AbstractC0929b f27043x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$addToView$9(NewListingDetailsFragment newListingDetailsFragment, b.AbstractC0929b abstractC0929b, zz.a<? super NewListingDetailsFragment$addToView$9> aVar) {
        super(2, aVar);
        this.f27042j = newListingDetailsFragment;
        this.f27043x = abstractC0929b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsFragment$addToView$9(this.f27042j, this.f27043x, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        lr.a aVar;
        ListingItemDetails a11;
        m[] mVarArr;
        m[] mVarArr2;
        int i11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        lr.a aVar2;
        ListingDetailsViewModel listingDetailsViewModel;
        ApplicationResourcesRepository applicationResourcesRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i12 = this.f27041i;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = this.f27040h;
                a11 = (ListingItemDetails) this.f27037e;
                f.b(obj);
                aVar2 = (lr.a) this.f27034b;
                mVarArr2 = (m[]) this.f27033a;
                mVarArr = (m[]) this.f27035c;
                aggregatedAllAnalyticsLogger = (AggregatedAllAnalyticsLogger) this.f27039g;
                listingDetailsViewModel = (CoroutineScope) this.f27036d;
                applicationResourcesRepository = (ApplicationResourcesRepository) this.f27038f;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aVar = this.f27042j.H;
            m[] mVarArr3 = new m[1];
            ListingDetailsViewModel l02 = this.f27042j.l0();
            a11 = ((b.AbstractC0929b.e) this.f27043x).a();
            ApplicationResourcesRepository k02 = this.f27042j.k0();
            AggregatedAllAnalyticsLogger c02 = this.f27042j.c0();
            NewListingDetailsViewModel B = this.f27042j.B();
            this.f27033a = mVarArr3;
            this.f27034b = aVar;
            this.f27035c = mVarArr3;
            this.f27036d = l02;
            this.f27037e = a11;
            this.f27038f = k02;
            this.f27039g = c02;
            this.f27040h = 0;
            this.f27041i = 1;
            Object I1 = B.I1(this);
            if (I1 == f11) {
                return f11;
            }
            mVarArr = mVarArr3;
            mVarArr2 = mVarArr;
            i11 = 0;
            aggregatedAllAnalyticsLogger = c02;
            aVar2 = aVar;
            listingDetailsViewModel = l02;
            applicationResourcesRepository = k02;
            obj = I1;
        }
        DraftCardViewModel draftCardViewModel = new DraftCardViewModel(listingDetailsViewModel, a11, applicationResourcesRepository, aggregatedAllAnalyticsLogger, (String) obj);
        s viewLifecycleOwner = this.f27042j.getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        mVarArr[i11] = new tb.a(draftCardViewModel, viewLifecycleOwner);
        return aVar2.n(mVarArr2);
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super c<m<?>, m<?>>> aVar) {
        return ((NewListingDetailsFragment$addToView$9) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
