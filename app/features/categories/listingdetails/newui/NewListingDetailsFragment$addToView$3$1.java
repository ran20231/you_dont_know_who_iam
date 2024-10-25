package com.forsale.app.features.categories.listingdetails.newui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.userinfoitem.UserInfoViewModel;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kr.m;
import lr.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$3$1", f = "NewListingDetailsFragment.kt", l = {554}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsFragment$addToView$3$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super c<m<?>, m<?>>>, Object> {
    int A;
    final /* synthetic */ NewListingDetailsFragment B;
    final /* synthetic */ ListingItemDetails C;

    /* renamed from: a  reason: collision with root package name */
    Object f27012a;

    /* renamed from: b  reason: collision with root package name */
    Object f27013b;

    /* renamed from: c  reason: collision with root package name */
    Object f27014c;

    /* renamed from: d  reason: collision with root package name */
    Object f27015d;

    /* renamed from: e  reason: collision with root package name */
    Object f27016e;

    /* renamed from: f  reason: collision with root package name */
    Object f27017f;

    /* renamed from: g  reason: collision with root package name */
    Object f27018g;

    /* renamed from: h  reason: collision with root package name */
    Object f27019h;

    /* renamed from: i  reason: collision with root package name */
    Object f27020i;

    /* renamed from: j  reason: collision with root package name */
    Object f27021j;

    /* renamed from: x  reason: collision with root package name */
    int f27022x;

    /* renamed from: y  reason: collision with root package name */
    int f27023y;

    /* renamed from: z  reason: collision with root package name */
    boolean f27024z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$addToView$3$1(NewListingDetailsFragment newListingDetailsFragment, ListingItemDetails listingItemDetails, zz.a<? super NewListingDetailsFragment$addToView$3$1> aVar) {
        super(2, aVar);
        this.B = newListingDetailsFragment;
        this.C = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsFragment$addToView$3$1(this.B, this.C, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        lr.a aVar;
        TranslationRepository.Translation translation;
        RegionsRepository j02;
        Object a11;
        m[] mVarArr;
        int i11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        UserProfileData userProfileData;
        lr.a aVar2;
        ApplicationResourcesRepository applicationResourcesRepository;
        ListingItemDetails listingItemDetails;
        ListingDetailsViewModel listingDetailsViewModel;
        int i12;
        TranslationRepository.Translation translation2;
        boolean z11;
        m[] mVarArr2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i13 = this.A;
        if (i13 != 0) {
            if (i13 == 1) {
                int i14 = this.f27023y;
                boolean z12 = this.f27024z;
                int i15 = this.f27022x;
                f.b(obj);
                aVar2 = (lr.a) this.f27013b;
                mVarArr = (m[]) this.f27012a;
                j02 = (RegionsRepository) this.f27021j;
                applicationResourcesRepository = (ApplicationResourcesRepository) this.f27020i;
                listingDetailsViewModel = (CoroutineScope) this.f27015d;
                translation2 = (TranslationRepository.Translation) this.f27018g;
                z11 = z12;
                mVarArr2 = (m[]) this.f27014c;
                aggregatedAllAnalyticsLogger = (AggregatedAllAnalyticsLogger) this.f27019h;
                userProfileData = (UserProfileData) this.f27016e;
                listingItemDetails = (ListingItemDetails) this.f27017f;
                i12 = i14;
                i11 = i15;
                a11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aVar = this.B.H;
            m[] mVarArr3 = new m[1];
            ListingDetailsViewModel l02 = this.B.l0();
            UserProfileData b11 = UserProfileData.CREATOR.b(this.C.getUser(), kotlin.coroutines.jvm.internal.a.d(this.C.getId()));
            boolean x12 = this.B.l0().x1();
            int isHideMyNumber = this.C.isHideMyNumber();
            ListingItemDetails listingItemDetails2 = this.C;
            LiveData<TranslationRepository.Translation> t12 = this.B.l0().t1();
            if (t12 != null) {
                translation = t12.getValue();
            } else {
                translation = null;
            }
            TranslationRepository.Translation translation3 = translation;
            AggregatedAllAnalyticsLogger c02 = this.B.c0();
            ApplicationResourcesRepository k02 = this.B.k0();
            j02 = this.B.j0();
            kj.b c11 = this.B.i0().c();
            this.f27012a = mVarArr3;
            this.f27013b = aVar;
            this.f27014c = mVarArr3;
            this.f27015d = l02;
            this.f27016e = b11;
            this.f27017f = listingItemDetails2;
            this.f27018g = translation3;
            this.f27019h = c02;
            this.f27020i = k02;
            this.f27021j = j02;
            this.f27022x = 0;
            this.f27024z = x12;
            this.f27023y = isHideMyNumber;
            this.A = 1;
            a11 = c11.a(this);
            if (a11 == f11) {
                return f11;
            }
            mVarArr = mVarArr3;
            i11 = 0;
            aggregatedAllAnalyticsLogger = c02;
            userProfileData = b11;
            aVar2 = aVar;
            applicationResourcesRepository = k02;
            listingItemDetails = listingItemDetails2;
            listingDetailsViewModel = l02;
            i12 = isHideMyNumber;
            translation2 = translation3;
            z11 = x12;
            mVarArr2 = mVarArr;
        }
        String str = (String) a11;
        lr.a aVar3 = aVar2;
        UserInfoViewModel userInfoViewModel = new UserInfoViewModel(listingDetailsViewModel, userProfileData, z11, i12, listingItemDetails, translation2, aggregatedAllAnalyticsLogger, applicationResourcesRepository, j02, str, false, 1024, null);
        s viewLifecycleOwner = this.B.getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        mVarArr2[i11] = new qb.a(userInfoViewModel, viewLifecycleOwner);
        return aVar3.n(mVarArr);
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super c<m<?>, m<?>>> aVar) {
        return ((NewListingDetailsFragment$addToView$3$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
