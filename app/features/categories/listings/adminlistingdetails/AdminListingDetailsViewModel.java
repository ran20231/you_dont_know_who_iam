package com.forsale.app.features.categories.listings.adminlistingdetails;

import androidx.databinding.ObservableField;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.DynamicLinksUtils;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.OneShotEventHandler;
import com.leanplum.core.BuildConfig;
import g00.l;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import wz.i;
import wz.p;
/* compiled from: AdminListingDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class AdminListingDetailsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final int f28051k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingItemBrief f28052l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ListingsService f28053m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ApplicationResourcesRepository f28054n0;

    /* renamed from: o0  reason: collision with root package name */
    private final DynamicLinksUtils f28055o0;

    /* renamed from: p0  reason: collision with root package name */
    private ListingItemDetails f28056p0;

    /* renamed from: q0  reason: collision with root package name */
    private final ObservableField<String> f28057q0;

    /* renamed from: r0  reason: collision with root package name */
    private final ObservableField<String> f28058r0;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<String> f28059s0;

    /* renamed from: t0  reason: collision with root package name */
    private final OneShotEventHandler<String> f28060t0;

    /* renamed from: u0  reason: collision with root package name */
    private final OneShotEventHandler<String> f28061u0;

    /* renamed from: v0  reason: collision with root package name */
    private final OneShotEventHandler<p> f28062v0;

    /* compiled from: AdminListingDetailsViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsViewModel$2", f = "AdminListingDetailsViewModel.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsViewModel$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28067a;

        AnonymousClass2(zz.a<? super AnonymousClass2> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass2(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f28067a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                ListingsService listingsService = AdminListingDetailsViewModel.this.f28053m0;
                GetListingDetailsBody createListingDetails$default = GetListingDetailsBody.Companion.createListingDetails$default(GetListingDetailsBody.Companion, new ListingDetailsType.AdvId(AdminListingDetailsViewModel.this.w0()), LocaleManager.f39597a.g(), null, 4, null);
                this.f28067a = 1;
                obj = listingsService.getListingDetails(createListingDetails$default, this);
                if (obj == f11) {
                    return f11;
                }
            }
            AdminListingDetailsViewModel adminListingDetailsViewModel = AdminListingDetailsViewModel.this;
            ListingItemDetails listingItemDetails = (ListingItemDetails) obj;
            adminListingDetailsViewModel.J0(listingItemDetails);
            adminListingDetailsViewModel.A0().k(String.valueOf(listingItemDetails.getViewCount()));
            List<String> images = listingItemDetails.getImages();
            if (images != null && (!images.isEmpty())) {
                adminListingDetailsViewModel.y0().k(images.get(0));
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: AdminListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        AdminListingDetailsViewModel a(int i11, ListingItemBrief listingItemBrief);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdminListingDetailsViewModel f28069a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, AdminListingDetailsViewModel adminListingDetailsViewModel) {
            super(key);
            this.f28069a = adminListingDetailsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                AdminListingDetailsViewModel adminListingDetailsViewModel = this.f28069a;
                BuildersKt__Builders_commonKt.launch$default(adminListingDetailsViewModel, null, null, new AdminListingDetailsViewModel$1$1(adminListingDetailsViewModel, null), 3, null);
            } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
                final AdminListingDetailsViewModel adminListingDetailsViewModel2 = this.f28069a;
                g00.a<p> aVar = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsViewModel$1$okCancelLambdas$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AdminListingDetailsViewModel.this.x0().i(p.f75480a);
                    }
                };
                final AdminListingDetailsViewModel adminListingDetailsViewModel3 = this.f28069a;
                this.f28069a.C().postValue(i.a(Integer.valueOf(y0.I5), i.a(aVar, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsViewModel$1$okCancelLambdas$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AdminListingDetailsViewModel.this.x0().i(p.f75480a);
                    }
                })));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminListingDetailsViewModel(int i11, ListingItemBrief listingItemBrief, ListingsService listingsService, ApplicationResourcesRepository resourcesRepository, BaseRepository baseRepository, DynamicLinksUtils dynamicLinksUtils) {
        super(baseRepository);
        o.i(listingsService, "listingsService");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(baseRepository, "baseRepository");
        o.i(dynamicLinksUtils, "dynamicLinksUtils");
        this.f28051k0 = i11;
        this.f28052l0 = listingItemBrief;
        this.f28053m0 = listingsService;
        this.f28054n0 = resourcesRepository;
        this.f28055o0 = dynamicLinksUtils;
        this.f28057q0 = new ObservableField<>(BuildConfig.BUILD_NUMBER);
        this.f28058r0 = new ObservableField<>((listingItemBrief == null || (r8 = listingItemBrief.getImage()) == null) ? "" : "");
        this.f28059s0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f28060t0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f28061u0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f28062v0 = new OneShotEventHandler<>(null, 0, 3, null);
        BuildersKt__Builders_commonKt.launch$default(this, new b(CoroutineExceptionHandler.Key, this), null, new AnonymousClass2(null), 2, null);
    }

    private final void I0() {
        String str;
        ListingItemBrief listingItemBrief = this.f28052l0;
        if (listingItemBrief == null || (str = listingItemBrief.getUrl()) == null) {
            ListingItemDetails listingItemDetails = this.f28056p0;
            if (listingItemDetails != null) {
                str = listingItemDetails.getUrl();
            } else {
                str = null;
            }
        }
        if (str != null) {
            this.f28061u0.i(str);
        }
    }

    public final ObservableField<String> A0() {
        return this.f28057q0;
    }

    public final OneShotEventHandler<String> B0() {
        return this.f28060t0;
    }

    public final OneShotEventHandler<String> C0() {
        return this.f28061u0;
    }

    public final void D0() {
        I0();
    }

    public final void E0() {
        String str;
        ListingItemBrief listingItemBrief = this.f28052l0;
        if (listingItemBrief == null || (str = listingItemBrief.getContact()) == null) {
            ListingItemDetails listingItemDetails = this.f28056p0;
            if (listingItemDetails != null) {
                str = listingItemDetails.getContacts();
            } else {
                str = null;
            }
        }
        if (str == null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AdminListingDetailsViewModel$onPhoneCallClicked$2$1(this, null), 3, null);
            return;
        }
        this.f28059s0.i("+" + str);
    }

    public final void G0() {
        I0();
    }

    public final void H0() {
        String d11 = this.f28055o0.d(String.valueOf(this.f28051k0), ItemStatus.COMMERCIAL);
        String string = this.f28054n0.getString(y0.f70561lf, new Object[0]);
        DynamicLinksUtils dynamicLinksUtils = this.f28055o0;
        dynamicLinksUtils.e(d11, string, string + ": ", new l<String, p>() { // from class: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsViewModel$onWhatsAppClicked$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String it2) {
                o.i(it2, "it");
                AdminListingDetailsViewModel.this.B0().i(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        });
    }

    public final void J0(ListingItemDetails listingItemDetails) {
        this.f28056p0 = listingItemDetails;
    }

    public final int w0() {
        return this.f28051k0;
    }

    public final OneShotEventHandler<p> x0() {
        return this.f28062v0;
    }

    public final ObservableField<String> y0() {
        return this.f28058r0;
    }

    public final OneShotEventHandler<String> z0() {
        return this.f28059s0;
    }
}
