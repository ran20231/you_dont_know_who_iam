package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import androidx.databinding.ObservableField;
import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import t9.y0;
import wz.i;
import wz.p;
/* compiled from: ListingChatViewModel.kt */
/* loaded from: classes2.dex */
public final class ListingChatViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final a f27348k0;

    /* renamed from: l0  reason: collision with root package name */
    private UserProfileData f27349l0;

    /* renamed from: m0  reason: collision with root package name */
    private ListingItemBrief f27350m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ListingsService f27351n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ObservableField<String> f27352o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<ListingItemBrief> f27353p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<UserProfileData> f27354q0;

    /* renamed from: r0  reason: collision with root package name */
    private final b0<p> f27355r0;

    /* compiled from: ListingChatViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f27356a;

        /* renamed from: b  reason: collision with root package name */
        private final String f27357b;

        /* renamed from: c  reason: collision with root package name */
        private final String f27358c;

        /* renamed from: d  reason: collision with root package name */
        private final String f27359d;

        /* renamed from: e  reason: collision with root package name */
        private final String f27360e;

        /* renamed from: f  reason: collision with root package name */
        private final String f27361f;

        /* renamed from: g  reason: collision with root package name */
        private final String f27362g;

        public a(String userId, String peerId, String str, String itemTitle, String str2, String str3, String str4) {
            o.i(userId, "userId");
            o.i(peerId, "peerId");
            o.i(itemTitle, "itemTitle");
            this.f27356a = userId;
            this.f27357b = peerId;
            this.f27358c = str;
            this.f27359d = itemTitle;
            this.f27360e = str2;
            this.f27361f = str3;
            this.f27362g = str4;
        }

        public final String a() {
            return this.f27358c;
        }

        public final String b() {
            return this.f27360e;
        }

        public final String c() {
            return this.f27359d;
        }

        public final String d() {
            return this.f27357b;
        }

        public final String e() {
            return this.f27362g;
        }

        public final String f() {
            return this.f27356a;
        }
    }

    /* compiled from: ListingChatViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        ListingChatViewModel a(a aVar, UserProfileData userProfileData, ListingItemBrief listingItemBrief);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingChatViewModel f27363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, ListingChatViewModel listingChatViewModel) {
            super(key);
            this.f27363a = listingChatViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof ResponseWrapper.ResponseErrorException) {
                final ListingChatViewModel listingChatViewModel = this.f27363a;
                g00.a<p> aVar = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatViewModel$coroutineContext$1$okCancelLambdas$1
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
                        ListingChatViewModel.this.w0().postValue(p.f75480a);
                    }
                };
                final ListingChatViewModel listingChatViewModel2 = this.f27363a;
                this.f27363a.C().postValue(i.a(Integer.valueOf(y0.I5), i.a(aVar, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatViewModel$coroutineContext$1$okCancelLambdas$2
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
                        ListingChatViewModel.this.w0().postValue(p.f75480a);
                    }
                })));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingChatViewModel(a listingChatModel, UserProfileData userProfileData, ListingItemBrief listingItemBrief, ListingsService listingsService, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(listingChatModel, "listingChatModel");
        o.i(listingsService, "listingsService");
        o.i(baseRepository, "baseRepository");
        this.f27348k0 = listingChatModel;
        this.f27349l0 = userProfileData;
        this.f27350m0 = listingItemBrief;
        this.f27351n0 = listingsService;
        this.f27352o0 = new ObservableField<>();
        this.f27353p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27354q0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27355r0 = new b0<>();
        if (this.f27349l0 == null || this.f27350m0 == null) {
            E0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A0(zz.a<? super ListingItemDetails> aVar) {
        Object f11;
        if (this.f27348k0.a() != null && !o.d(this.f27348k0.a(), "null")) {
            Object listingDetails = this.f27351n0.getListingDetails(GetListingDetailsBody.Companion.createListingDetails$default(GetListingDetailsBody.Companion, new ListingDetailsType.AdvId(Integer.parseInt(this.f27348k0.a())), LocaleManager.f39597a.g(), null, 4, null), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (listingDetails == f11) {
                return listingDetails;
            }
            return (ListingItemDetails) listingDetails;
        }
        return null;
    }

    private final void E0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingChatViewModel$initData$1(this, null), 3, null);
    }

    public final OneShotEventHandler<UserProfileData> B0() {
        return this.f27354q0;
    }

    public final UserProfileData C0() {
        return this.f27349l0;
    }

    public final ObservableField<String> D0() {
        return this.f27352o0;
    }

    public final void G0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingChatViewModel$onItemClick$1(this, null), 3, null);
    }

    public final void H0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingChatViewModel$onProfileClick$1(this, null), 3, null);
    }

    public final void I0(ListingItemBrief listingItemBrief) {
        this.f27350m0 = listingItemBrief;
    }

    public final void J0(UserProfileData userProfileData) {
        this.f27349l0 = userProfileData;
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new c(CoroutineExceptionHandler.Key, this));
    }

    public final b0<p> w0() {
        return this.f27355r0;
    }

    public final ListingItemBrief x0() {
        return this.f27350m0;
    }

    public final OneShotEventHandler<ListingItemBrief> y0() {
        return this.f27353p0;
    }

    public final a z0() {
        return this.f27348k0;
    }
}
