package com.forsale.app.ui.bottomsheets.listingdetailsselleraction;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItemViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItemViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.hidemynumber.SellerActionHideMyNumberItem;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.hidemynumber.SellerActionHideMyNumberItemViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kr.m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$bindActions$1", f = "SellerActionBottomSheet.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionBottomSheet$bindActions$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38501a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38502b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SellerActionBottomSheet f38503c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerActionBottomSheet.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$bindActions$1$1", f = "SellerActionBottomSheet.kt", l = {83, 85, 87, 89}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$bindActions$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f38504a;

        /* renamed from: b  reason: collision with root package name */
        Object f38505b;

        /* renamed from: c  reason: collision with root package name */
        Object f38506c;

        /* renamed from: d  reason: collision with root package name */
        Object f38507d;

        /* renamed from: e  reason: collision with root package name */
        Object f38508e;

        /* renamed from: f  reason: collision with root package name */
        Object f38509f;

        /* renamed from: g  reason: collision with root package name */
        Object f38510g;

        /* renamed from: h  reason: collision with root package name */
        Object f38511h;

        /* renamed from: i  reason: collision with root package name */
        Object f38512i;

        /* renamed from: j  reason: collision with root package name */
        Object f38513j;

        /* renamed from: x  reason: collision with root package name */
        int f38514x;

        /* renamed from: y  reason: collision with root package name */
        int f38515y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ SellerActionBottomSheet f38516z;

        /* compiled from: SellerActionBottomSheet.kt */
        /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$bindActions$1$1$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f38517a;

            static {
                int[] iArr = new int[SellerActionType.values().length];
                try {
                    iArr[SellerActionType.AUTO_RE_POST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SellerActionType.HIDE_MY_NUMBER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SellerActionType.MANUAL_RE_POST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SellerActionType.ADD_ADDITIONAL_NUMBER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f38517a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerActionBottomSheet sellerActionBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38516z = sellerActionBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f38516z, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v19, types: [kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r8v21, types: [kotlinx.coroutines.CoroutineScope] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SellerActionType sellerActionType;
            lr.a aVar;
            CoroutineScope t11;
            ListingItemDetails listingItemDetails;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition;
            Object w02;
            int i11;
            AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
            RegionsRepository regionsRepository;
            ApplicationResourcesRepository applicationResourcesRepository;
            MyListingsService myListingsService;
            m[] mVarArr;
            ListingItemDetails listingItemDetails2;
            m[] mVarArr2;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2;
            lr.a aVar2;
            lr.a aVar3;
            m[] mVarArr3;
            ListingItemDetails listingItemDetails3;
            Object w03;
            int i12;
            AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger2;
            SellerActionViewModel sellerActionViewModel;
            ApplicationResourcesRepository applicationResourcesRepository2;
            MyListingsService myListingsService2;
            m[] mVarArr4;
            ListingItemDetails listingItemDetails4;
            lr.a aVar4;
            lr.a aVar5;
            ListingItemDetails listingItemDetails5;
            Object w04;
            int i13;
            lr.a aVar6;
            ListingItemDetails listingItemDetails6;
            m[] mVarArr5;
            SellerActionManualRepostItemViewModel.a aVar7;
            CoroutineScope coroutineScope;
            m[] mVarArr6;
            lr.a aVar8;
            ListingItemDetails listingItemDetails7;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition3;
            Object w05;
            int i14;
            SellerActionViewModel sellerActionViewModel2;
            RegionsRepository regionsRepository2;
            ListingItemDetails listingItemDetails8;
            m[] mVarArr7;
            AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger3;
            ApplicationResourcesRepository applicationResourcesRepository3;
            lr.a aVar9;
            MyListingsService myListingsService3;
            m[] mVarArr8;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition4;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i15 = this.f38515y;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 4) {
                                i14 = this.f38514x;
                                ?? r102 = (CoroutineScope) this.f38507d;
                                m[] mVarArr9 = (m[]) this.f38504a;
                                f.b(obj);
                                regionsRepository2 = (RegionsRepository) this.f38513j;
                                aggregatedAllAnalyticsLogger3 = (AggregatedAllAnalyticsLogger) this.f38512i;
                                mVarArr7 = (m[]) this.f38506c;
                                w05 = obj;
                                analyticsPosition4 = (AggregatedAllAnalyticsLogger.AnalyticsPosition) this.f38509f;
                                applicationResourcesRepository3 = (ApplicationResourcesRepository) this.f38511h;
                                aVar9 = (lr.a) this.f38505b;
                                myListingsService3 = (MyListingsService) this.f38510g;
                                mVarArr8 = mVarArr9;
                                listingItemDetails8 = (ListingItemDetails) this.f38508e;
                                sellerActionViewModel2 = r102;
                                SellerActionAddAdditionalContactsItemViewModel sellerActionAddAdditionalContactsItemViewModel = new SellerActionAddAdditionalContactsItemViewModel(sellerActionViewModel2, listingItemDetails8, analyticsPosition4, myListingsService3, applicationResourcesRepository3, aggregatedAllAnalyticsLogger3, regionsRepository2, (String) w05, this.f38516z.K());
                                s viewLifecycleOwner = this.f38516z.getViewLifecycleOwner();
                                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                FragmentManager childFragmentManager = this.f38516z.getChildFragmentManager();
                                o.h(childFragmentManager, "getChildFragmentManager(...)");
                                mVarArr7[i14] = new SellerActionAddAdditionalContactsItem(sellerActionAddAdditionalContactsItemViewModel, viewLifecycleOwner, childFragmentManager, this.f38516z.t());
                                aVar9.n(mVarArr8);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            i13 = this.f38514x;
                            listingItemDetails6 = (ListingItemDetails) this.f38509f;
                            coroutineScope = (CoroutineScope) this.f38508e;
                            f.b(obj);
                            mVarArr5 = (m[]) this.f38504a;
                            aVar6 = (lr.a) this.f38505b;
                            mVarArr6 = (m[]) this.f38506c;
                            aVar7 = (SellerActionManualRepostItemViewModel.a) this.f38507d;
                            w04 = obj;
                            SellerActionManualRepostItemViewModel a11 = aVar7.a(coroutineScope, listingItemDetails6, (String) w04);
                            s viewLifecycleOwner2 = this.f38516z.getViewLifecycleOwner();
                            o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                            FragmentManager childFragmentManager2 = this.f38516z.getChildFragmentManager();
                            o.h(childFragmentManager2, "getChildFragmentManager(...)");
                            mVarArr6[i13] = new SellerActionManualRepostItem(a11, viewLifecycleOwner2, childFragmentManager2, this.f38516z.t());
                            aVar6.n(mVarArr5);
                        }
                    } else {
                        i12 = this.f38514x;
                        m[] mVarArr10 = (m[]) this.f38504a;
                        f.b(obj);
                        aggregatedAllAnalyticsLogger2 = (AggregatedAllAnalyticsLogger) this.f38511h;
                        applicationResourcesRepository2 = (ApplicationResourcesRepository) this.f38510g;
                        mVarArr3 = (m[]) this.f38506c;
                        aVar4 = (lr.a) this.f38505b;
                        listingItemDetails4 = (ListingItemDetails) this.f38508e;
                        sellerActionViewModel = (CoroutineScope) this.f38507d;
                        w03 = obj;
                        myListingsService2 = (MyListingsService) this.f38509f;
                        mVarArr4 = mVarArr10;
                        SellerActionHideMyNumberItemViewModel sellerActionHideMyNumberItemViewModel = new SellerActionHideMyNumberItemViewModel(sellerActionViewModel, listingItemDetails4, myListingsService2, applicationResourcesRepository2, aggregatedAllAnalyticsLogger2, (String) w03);
                        s viewLifecycleOwner3 = this.f38516z.getViewLifecycleOwner();
                        o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                        FragmentManager childFragmentManager3 = this.f38516z.getChildFragmentManager();
                        o.h(childFragmentManager3, "getChildFragmentManager(...)");
                        mVarArr3[i12] = new SellerActionHideMyNumberItem(sellerActionHideMyNumberItemViewModel, viewLifecycleOwner3, childFragmentManager3, this.f38516z.t());
                        aVar4.n(mVarArr4);
                    }
                } else {
                    i11 = this.f38514x;
                    t11 = (CoroutineScope) this.f38507d;
                    f.b(obj);
                    regionsRepository = (RegionsRepository) this.f38513j;
                    aggregatedAllAnalyticsLogger = (AggregatedAllAnalyticsLogger) this.f38512i;
                    applicationResourcesRepository = (ApplicationResourcesRepository) this.f38511h;
                    mVarArr2 = (m[]) this.f38506c;
                    aVar2 = (lr.a) this.f38505b;
                    mVarArr = (m[]) this.f38504a;
                    myListingsService = (MyListingsService) this.f38510g;
                    analyticsPosition2 = (AggregatedAllAnalyticsLogger.AnalyticsPosition) this.f38509f;
                    listingItemDetails2 = (ListingItemDetails) this.f38508e;
                    w02 = obj;
                    SellerActionAutoRepostItemViewModel sellerActionAutoRepostItemViewModel = new SellerActionAutoRepostItemViewModel(t11, listingItemDetails2, analyticsPosition2, myListingsService, applicationResourcesRepository, aggregatedAllAnalyticsLogger, regionsRepository, (String) w02);
                    s viewLifecycleOwner4 = this.f38516z.getViewLifecycleOwner();
                    o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                    FragmentManager childFragmentManager4 = this.f38516z.getChildFragmentManager();
                    o.h(childFragmentManager4, "getChildFragmentManager(...)");
                    mVarArr2[i11] = new SellerActionAutoRepostItem(sellerActionAutoRepostItemViewModel, viewLifecycleOwner4, childFragmentManager4, this.f38516z.t());
                    aVar2.n(mVarArr);
                }
            } else {
                f.b(obj);
                sellerActionType = this.f38516z.f38489j;
                int i16 = a.f38517a[sellerActionType.ordinal()];
                if (i16 == 1) {
                    aVar = this.f38516z.C;
                    m[] mVarArr11 = new m[1];
                    t11 = this.f38516z.t();
                    listingItemDetails = this.f38516z.f38490x;
                    analyticsPosition = this.f38516z.f38491y;
                    MyListingsService J = this.f38516z.J();
                    ApplicationResourcesRepository J2 = this.f38516z.t().J();
                    AggregatedAllAnalyticsLogger r11 = this.f38516z.t().r();
                    RegionsRepository I = this.f38516z.t().I();
                    SellerActionViewModel t12 = this.f38516z.t();
                    this.f38504a = mVarArr11;
                    this.f38505b = aVar;
                    this.f38506c = mVarArr11;
                    this.f38507d = t11;
                    this.f38508e = listingItemDetails;
                    this.f38509f = analyticsPosition;
                    this.f38510g = J;
                    this.f38511h = J2;
                    this.f38512i = r11;
                    this.f38513j = I;
                    this.f38514x = 0;
                    this.f38515y = 1;
                    w02 = t12.w0(this);
                    if (w02 == f11) {
                        return f11;
                    }
                    i11 = 0;
                    aggregatedAllAnalyticsLogger = r11;
                    regionsRepository = I;
                    applicationResourcesRepository = J2;
                    myListingsService = J;
                    mVarArr = mVarArr11;
                    listingItemDetails2 = listingItemDetails;
                    mVarArr2 = mVarArr;
                    analyticsPosition2 = analyticsPosition;
                    aVar2 = aVar;
                    SellerActionAutoRepostItemViewModel sellerActionAutoRepostItemViewModel2 = new SellerActionAutoRepostItemViewModel(t11, listingItemDetails2, analyticsPosition2, myListingsService, applicationResourcesRepository, aggregatedAllAnalyticsLogger, regionsRepository, (String) w02);
                    s viewLifecycleOwner42 = this.f38516z.getViewLifecycleOwner();
                    o.h(viewLifecycleOwner42, "getViewLifecycleOwner(...)");
                    FragmentManager childFragmentManager42 = this.f38516z.getChildFragmentManager();
                    o.h(childFragmentManager42, "getChildFragmentManager(...)");
                    mVarArr2[i11] = new SellerActionAutoRepostItem(sellerActionAutoRepostItemViewModel2, viewLifecycleOwner42, childFragmentManager42, this.f38516z.t());
                    aVar2.n(mVarArr);
                } else if (i16 == 2) {
                    aVar3 = this.f38516z.C;
                    mVarArr3 = new m[1];
                    SellerActionViewModel t13 = this.f38516z.t();
                    listingItemDetails3 = this.f38516z.f38490x;
                    MyListingsService J3 = this.f38516z.J();
                    ApplicationResourcesRepository J4 = this.f38516z.t().J();
                    AggregatedAllAnalyticsLogger r12 = this.f38516z.t().r();
                    SellerActionViewModel t14 = this.f38516z.t();
                    this.f38504a = mVarArr3;
                    this.f38505b = aVar3;
                    this.f38506c = mVarArr3;
                    this.f38507d = t13;
                    this.f38508e = listingItemDetails3;
                    this.f38509f = J3;
                    this.f38510g = J4;
                    this.f38511h = r12;
                    this.f38514x = 0;
                    this.f38515y = 2;
                    w03 = t14.w0(this);
                    if (w03 == f11) {
                        return f11;
                    }
                    i12 = 0;
                    aggregatedAllAnalyticsLogger2 = r12;
                    sellerActionViewModel = t13;
                    applicationResourcesRepository2 = J4;
                    myListingsService2 = J3;
                    mVarArr4 = mVarArr3;
                    listingItemDetails4 = listingItemDetails3;
                    aVar4 = aVar3;
                    SellerActionHideMyNumberItemViewModel sellerActionHideMyNumberItemViewModel2 = new SellerActionHideMyNumberItemViewModel(sellerActionViewModel, listingItemDetails4, myListingsService2, applicationResourcesRepository2, aggregatedAllAnalyticsLogger2, (String) w03);
                    s viewLifecycleOwner32 = this.f38516z.getViewLifecycleOwner();
                    o.h(viewLifecycleOwner32, "getViewLifecycleOwner(...)");
                    FragmentManager childFragmentManager32 = this.f38516z.getChildFragmentManager();
                    o.h(childFragmentManager32, "getChildFragmentManager(...)");
                    mVarArr3[i12] = new SellerActionHideMyNumberItem(sellerActionHideMyNumberItemViewModel2, viewLifecycleOwner32, childFragmentManager32, this.f38516z.t());
                    aVar4.n(mVarArr4);
                } else if (i16 == 3) {
                    aVar5 = this.f38516z.C;
                    m[] mVarArr12 = new m[1];
                    SellerActionManualRepostItemViewModel.a I2 = this.f38516z.I();
                    SellerActionViewModel t15 = this.f38516z.t();
                    listingItemDetails5 = this.f38516z.f38490x;
                    SellerActionViewModel t16 = this.f38516z.t();
                    this.f38504a = mVarArr12;
                    this.f38505b = aVar5;
                    this.f38506c = mVarArr12;
                    this.f38507d = I2;
                    this.f38508e = t15;
                    this.f38509f = listingItemDetails5;
                    this.f38514x = 0;
                    this.f38515y = 3;
                    w04 = t16.w0(this);
                    if (w04 == f11) {
                        return f11;
                    }
                    i13 = 0;
                    aVar6 = aVar5;
                    listingItemDetails6 = listingItemDetails5;
                    mVarArr5 = mVarArr12;
                    aVar7 = I2;
                    coroutineScope = t15;
                    mVarArr6 = mVarArr5;
                    SellerActionManualRepostItemViewModel a112 = aVar7.a(coroutineScope, listingItemDetails6, (String) w04);
                    s viewLifecycleOwner22 = this.f38516z.getViewLifecycleOwner();
                    o.h(viewLifecycleOwner22, "getViewLifecycleOwner(...)");
                    FragmentManager childFragmentManager22 = this.f38516z.getChildFragmentManager();
                    o.h(childFragmentManager22, "getChildFragmentManager(...)");
                    mVarArr6[i13] = new SellerActionManualRepostItem(a112, viewLifecycleOwner22, childFragmentManager22, this.f38516z.t());
                    aVar6.n(mVarArr5);
                } else if (i16 == 4) {
                    aVar8 = this.f38516z.C;
                    m[] mVarArr13 = new m[1];
                    SellerActionViewModel t17 = this.f38516z.t();
                    listingItemDetails7 = this.f38516z.f38490x;
                    analyticsPosition3 = this.f38516z.f38491y;
                    MyListingsService J5 = this.f38516z.J();
                    ApplicationResourcesRepository J6 = this.f38516z.t().J();
                    AggregatedAllAnalyticsLogger r13 = this.f38516z.t().r();
                    RegionsRepository I3 = this.f38516z.t().I();
                    SellerActionViewModel t18 = this.f38516z.t();
                    this.f38504a = mVarArr13;
                    this.f38505b = aVar8;
                    this.f38506c = mVarArr13;
                    this.f38507d = t17;
                    this.f38508e = listingItemDetails7;
                    this.f38509f = analyticsPosition3;
                    this.f38510g = J5;
                    this.f38511h = J6;
                    this.f38512i = r13;
                    this.f38513j = I3;
                    this.f38514x = 0;
                    this.f38515y = 4;
                    w05 = t18.w0(this);
                    if (w05 == f11) {
                        return f11;
                    }
                    i14 = 0;
                    sellerActionViewModel2 = t17;
                    regionsRepository2 = I3;
                    listingItemDetails8 = listingItemDetails7;
                    mVarArr7 = mVarArr13;
                    aggregatedAllAnalyticsLogger3 = r13;
                    applicationResourcesRepository3 = J6;
                    aVar9 = aVar8;
                    myListingsService3 = J5;
                    mVarArr8 = mVarArr7;
                    analyticsPosition4 = analyticsPosition3;
                    SellerActionAddAdditionalContactsItemViewModel sellerActionAddAdditionalContactsItemViewModel2 = new SellerActionAddAdditionalContactsItemViewModel(sellerActionViewModel2, listingItemDetails8, analyticsPosition4, myListingsService3, applicationResourcesRepository3, aggregatedAllAnalyticsLogger3, regionsRepository2, (String) w05, this.f38516z.K());
                    s viewLifecycleOwner5 = this.f38516z.getViewLifecycleOwner();
                    o.h(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                    FragmentManager childFragmentManager5 = this.f38516z.getChildFragmentManager();
                    o.h(childFragmentManager5, "getChildFragmentManager(...)");
                    mVarArr7[i14] = new SellerActionAddAdditionalContactsItem(sellerActionAddAdditionalContactsItemViewModel2, viewLifecycleOwner5, childFragmentManager5, this.f38516z.t());
                    aVar9.n(mVarArr8);
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionBottomSheet$bindActions$1(SellerActionBottomSheet sellerActionBottomSheet, zz.a<? super SellerActionBottomSheet$bindActions$1> aVar) {
        super(2, aVar);
        this.f38503c = sellerActionBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        SellerActionBottomSheet$bindActions$1 sellerActionBottomSheet$bindActions$1 = new SellerActionBottomSheet$bindActions$1(this.f38503c, aVar);
        sellerActionBottomSheet$bindActions$1.f38502b = obj;
        return sellerActionBottomSheet$bindActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38501a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38503c, null);
            this.f38501a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f38502b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SellerActionBottomSheet$bindActions$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
