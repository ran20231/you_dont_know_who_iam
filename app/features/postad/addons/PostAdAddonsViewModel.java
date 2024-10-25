package com.forsale.app.features.postad.addons;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.datalayer.network.responses.AddonsResponse;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.addonitem.AddonItemViewModel;
import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItemViewModel;
import com.forsale.app.features.postad.addons.featured.FeaturedAddonItemViewModel;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.KnetPaymentType;
import com.forsale.app.utils.analytics.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.s;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import t9.r0;
import t9.y0;
import wz.p;
/* compiled from: PostAdAddonsViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel extends BaseStatefulViewModel {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    private final MutableSharedFlow<p> A0;
    private final SharedFlow<p> B0;
    private final MutableSharedFlow<p> C0;
    private final SharedFlow<p> D0;
    private final ji.b E0;
    private List<FeaturedAddonItemViewModel> F0;
    private List<AddonsGroupItemViewModel> G0;
    private final g00.a<p> H0;
    private final g00.p<String, Boolean, p> I0;
    private final b0<Integer> J0;
    private final LiveData<Integer> K0;
    private final MutableSharedFlow<p> L0;
    private final SharedFlow<p> M0;
    private final MutableSharedFlow<p> N0;
    private final SharedFlow<p> O0;
    private final MutableSharedFlow<p> P0;
    private final SharedFlow<p> Q0;

    /* renamed from: l0 */
    private final MyListingsService f34319l0;

    /* renamed from: m0 */
    private final g f34320m0;

    /* renamed from: n0 */
    private final CategoriesRepositories f34321n0;

    /* renamed from: o0 */
    private final ApplicationResourcesRepository f34322o0;

    /* renamed from: p0 */
    private final PostAdViewModel f34323p0;

    /* renamed from: q0 */
    private final k0 f34324q0;

    /* renamed from: r0 */
    private final ListingDetailsEntity f34325r0;

    /* renamed from: s0 */
    private Integer f34326s0;

    /* renamed from: t0 */
    private final MutableSharedFlow<p> f34327t0;

    /* renamed from: u0 */
    private final SharedFlow<p> f34328u0;

    /* renamed from: v0 */
    private final MutableSharedFlow<List<FeaturedAddonItemViewModel>> f34329v0;

    /* renamed from: w0 */
    private final SharedFlow<List<FeaturedAddonItemViewModel>> f34330w0;

    /* renamed from: x0 */
    private final MutableSharedFlow<List<AddonsGroupItemViewModel>> f34331x0;

    /* renamed from: y0 */
    private final SharedFlow<List<AddonsGroupItemViewModel>> f34332y0;

    /* renamed from: z0 */
    private final b0<Boolean> f34333z0;

    /* compiled from: PostAdAddonsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class AddonsState {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AddonsState[] $VALUES;
        public static final AddonsState CONTENT = new AddonsState("CONTENT", 0);
        public static final AddonsState EMPTY = new AddonsState("EMPTY", 1);
        public static final AddonsState WAITING_APPROVAL = new AddonsState("WAITING_APPROVAL", 2);
        public static final AddonsState CONNECTION_ERROR = new AddonsState("CONNECTION_ERROR", 3);
        public static final AddonsState ERROR = new AddonsState("ERROR", 4);

        private static final /* synthetic */ AddonsState[] $values() {
            return new AddonsState[]{CONTENT, EMPTY, WAITING_APPROVAL, CONNECTION_ERROR, ERROR};
        }

        static {
            AddonsState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AddonsState(String str, int i11) {
            super(str, i11);
        }

        public static a00.a<AddonsState> getEntries() {
            return $ENTRIES;
        }

        public static AddonsState valueOf(String str) {
            return (AddonsState) Enum.valueOf(AddonsState.class, str);
        }

        public static AddonsState[] values() {
            return (AddonsState[]) $VALUES.clone();
        }
    }

    /* compiled from: PostAdAddonsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PostAdAddonsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        PostAdAddonsViewModel a(PostAdViewModel postAdViewModel, k0 k0Var);
    }

    /* compiled from: PostAdAddonsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34335a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f34336b;

        static {
            int[] iArr = new int[PostListingIntention.values().length];
            try {
                iArr[PostListingIntention.NON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostListingIntention.BOOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostListingIntention.NEW_LISTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostListingIntention.FULL_EDIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostListingIntention.RE_POST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostListingIntention.BOOST_LISTING_ABOUT_TO_EXPIRE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f34335a = iArr;
            int[] iArr2 = new int[AddonsState.values().length];
            try {
                iArr2[AddonsState.CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AddonsState.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AddonsState.WAITING_APPROVAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AddonsState.CONNECTION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AddonsState.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            f34336b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel(MyListingsService myListingsService, g aggregatedAnalyticsLogger, CategoriesRepositories categoriesRepository, ApplicationResourcesRepository resourcesRepository, PostAdViewModel postAdViewModel, k0 savedStateHandle, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(myListingsService, "myListingsService");
        o.i(aggregatedAnalyticsLogger, "aggregatedAnalyticsLogger");
        o.i(categoriesRepository, "categoriesRepository");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(postAdViewModel, "postAdViewModel");
        o.i(savedStateHandle, "savedStateHandle");
        o.i(baseRepository, "baseRepository");
        this.f34319l0 = myListingsService;
        this.f34320m0 = aggregatedAnalyticsLogger;
        this.f34321n0 = categoriesRepository;
        this.f34322o0 = resourcesRepository;
        this.f34323p0 = postAdViewModel;
        this.f34324q0 = savedStateHandle;
        ListingDetailsEntity n22 = postAdViewModel.n2();
        if (n22 != null) {
            savedStateHandle.j("listingDetails", n22);
        } else {
            Object f11 = savedStateHandle.f("listingDetails");
            o.f(f11);
            n22 = (ListingDetailsEntity) f11;
            postAdViewModel.p2().setValue(n22);
        }
        this.f34325r0 = n22;
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34327t0 = MutableSharedFlow$default;
        this.f34328u0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<List<FeaturedAddonItemViewModel>> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34329v0 = MutableSharedFlow$default2;
        this.f34330w0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<List<AddonsGroupItemViewModel>> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34331x0 = MutableSharedFlow$default3;
        this.f34332y0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        this.f34333z0 = new b0<>(Boolean.FALSE);
        MutableSharedFlow<p> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.A0 = MutableSharedFlow$default4;
        this.B0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<p> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.C0 = MutableSharedFlow$default5;
        this.D0 = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        this.E0 = new ji.b(false, 0, new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$statefulItemViewModel$1
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
                PostAdAddonsViewModel.this.w1();
            }
        }, 2, null);
        this.H0 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$addonsSelectionListener$1
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
                List<Addon> h12;
                h12 = PostAdAddonsViewModel.this.h1();
                PostAdAddonsViewModel postAdAddonsViewModel = PostAdAddonsViewModel.this;
                postAdAddonsViewModel.K1(h12);
                postAdAddonsViewModel.e1().Q4(h12);
            }
        };
        this.I0 = new g00.p<String, Boolean, p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$recordAddonSelectionAnalytics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String addonId, boolean z11) {
                o.i(addonId, "addonId");
                PostAdAddonsViewModel.this.y1(addonId, z11);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(String str, Boolean bool) {
                b(str, bool.booleanValue());
                return p.f75480a;
            }
        };
        b0<Integer> b0Var = new b0<>();
        this.J0 = b0Var;
        this.K0 = b0Var;
        MutableSharedFlow<p> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.L0 = MutableSharedFlow$default6;
        this.M0 = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        MutableSharedFlow<p> MutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.N0 = MutableSharedFlow$default7;
        this.O0 = FlowKt.asSharedFlow(MutableSharedFlow$default7);
        MutableSharedFlow<p> MutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.P0 = MutableSharedFlow$default8;
        this.Q0 = FlowKt.asSharedFlow(MutableSharedFlow$default8);
        aggregatedAnalyticsLogger.c(false, KnetPaymentType.ADDONS);
        p1(postAdViewModel.k2());
    }

    private final void B1(int i11) {
        this.J0.postValue(Integer.valueOf(i11));
    }

    public final void D1(Set<AddonItemViewModel> set) {
        if (set != null) {
            for (AddonItemViewModel addonItemViewModel : set) {
                addonItemViewModel.p(true);
                addonItemViewModel.n(true);
            }
        }
    }

    private final Object E1(AddonsResponse addonsResponse, zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getDefault(), new PostAdAddonsViewModel$setupAddonGroupsViewModels$2(this, addonsResponse, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }

    private final Object F1(List<AddonsGroup> list, zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getDefault(), new PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2(this, list, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }

    public static /* synthetic */ void J1(PostAdAddonsViewModel postAdAddonsViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        postAdAddonsViewModel.I1(z11);
    }

    public final ListingDetailsEntity K1(List<Addon> list) {
        int y11;
        List<Addon> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (Addon addon : list2) {
            arrayList.add(AddonsRequested.Companion.createFrom(addon));
        }
        this.f34325r0.setAddonsRequested(arrayList);
        ListingDetailsEntity n22 = this.f34323p0.n2();
        if (n22 != null) {
            n22.setAddonsRequested(arrayList);
        }
        return this.f34325r0;
    }

    private final List<Addon> S0(AddonsResponse addonsResponse) {
        List<Addon> E0;
        ArrayList arrayList = new ArrayList();
        for (AddonsGroup addonsGroup : addonsResponse.getAddonsGroups()) {
            w.D(arrayList, addonsGroup.getAddons());
        }
        ArrayList arrayList2 = new ArrayList();
        for (AddonsGroup addonsGroup2 : addonsResponse.getFeaturedAddonsGroups()) {
            w.D(arrayList2, addonsGroup2.getAddons());
        }
        E0 = CollectionsKt___CollectionsKt.E0(arrayList, arrayList2);
        return E0;
    }

    public final Object V0(zz.a<? super p> aVar) {
        boolean z11;
        ListingDetailsEntity listingDetailsEntity = this.f34325r0;
        if (listingDetailsEntity.getCategoryDistrict() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            listingDetailsEntity = null;
        }
        if (listingDetailsEntity != null) {
            this.f34323p0.M4(new PostAdAddonsViewModel$fetchCategoryDistrict$3$1(this, null));
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W0(zz.a<? super wz.p> r23) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.PostAdAddonsViewModel.W0(zz.a):java.lang.Object");
    }

    public final List<Addon> h1() {
        ArrayList arrayList = new ArrayList();
        List<FeaturedAddonItemViewModel> list = this.F0;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (FeaturedAddonItemViewModel featuredAddonItemViewModel : list) {
                Set<Addon> value = featuredAddonItemViewModel.m().getValue();
                if (value == null) {
                    value = q0.e();
                }
                w.D(arrayList2, value);
            }
            arrayList.addAll(arrayList2);
        }
        List<AddonsGroupItemViewModel> list2 = this.G0;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (AddonsGroupItemViewModel addonsGroupItemViewModel : list2) {
                w.D(arrayList3, addonsGroupItemViewModel.c());
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void n1(AddonsState addonsState) {
        String string;
        int i11 = c.f34336b[addonsState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            this.f34323p0.E4(false);
                            ji.b.l(this.E0, this.f34322o0.getString(y0.O4, new Object[0]), null, false, 6, null);
                            return;
                        }
                        return;
                    }
                    this.f34323p0.E4(false);
                    this.E0.i();
                    return;
                }
                this.f34323p0.E4(true);
                this.E0.k(this.f34322o0.getString(y0.f70443ef, new Object[0]), this.f34322o0.getString(y0.f70460ff, new Object[0]), false);
                return;
            }
            this.f34323p0.E4(true);
            ji.b bVar = this.E0;
            String string2 = this.f34322o0.getString(y0.f70743x, new Object[0]);
            if (this.f34323p0.q3()) {
                string = this.f34322o0.getString(y0.f70727w, new Object[0]);
            } else {
                string = this.f34322o0.getString(y0.f70711v, new Object[0]);
            }
            bVar.j(string2, string);
            return;
        }
        this.f34323p0.E4(true);
    }

    public final void p1(PostListingIntention postListingIntention) {
        switch (c.f34335a[postListingIntention.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                B1(y0.f70740wc);
                return;
            case 5:
                B1(y0.f70772yc);
                return;
            case 6:
                B1(y0.f70756xc);
                return;
            default:
                return;
        }
    }

    private final boolean r1(AddonsResponse addonsResponse) {
        boolean z11;
        boolean z12;
        List<AddonsGroup> addonsGroups = addonsResponse.getAddonsGroups();
        if (!(addonsGroups instanceof Collection) || !addonsGroups.isEmpty()) {
            for (AddonsGroup addonsGroup : addonsGroups) {
                if (!addonsGroup.getAddons().isEmpty()) {
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        List<AddonsGroup> featuredAddonsGroups = addonsResponse.getFeaturedAddonsGroups();
        if (!(featuredAddonsGroups instanceof Collection) || !featuredAddonsGroups.isEmpty()) {
            for (AddonsGroup addonsGroup2 : featuredAddonsGroups) {
                if (!addonsGroup2.getAddons().isEmpty()) {
                    z12 = false;
                    break;
                }
            }
        }
        z12 = true;
        if (!z11 || !z12) {
            return false;
        }
        return true;
    }

    private final boolean s1(int i11) {
        if (i11 == r0.A6) {
            return true;
        }
        return false;
    }

    private final void t1(CreateEditAdvActionType createEditAdvActionType, String str, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdAddonsViewModel$logAnalytics$1(this, createEditAdvActionType, str, z11, null), 3, null);
    }

    static /* synthetic */ void u1(PostAdAddonsViewModel postAdAddonsViewModel, CreateEditAdvActionType createEditAdvActionType, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        postAdAddonsViewModel.t1(createEditAdvActionType, str, z11);
    }

    private final void x1(AddonsResponse addonsResponse) {
        Object obj;
        List<Addon> S02 = S0(addonsResponse);
        ArrayList arrayList = new ArrayList();
        for (AddonsRequested addonsRequested : this.f34325r0.getAddonsRequested()) {
            Iterator<T> it2 = S02.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (o.d(addonsRequested.getAddon(), ((Addon) obj).getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                arrayList.add(addonsRequested);
            }
        }
        this.f34325r0.setAddonsRequested(arrayList);
        ListingDetailsEntity n22 = this.f34323p0.n2();
        if (n22 != null) {
            n22.setAddonsRequested(arrayList);
        }
        this.f34323p0.I4();
    }

    public final void y1(String str, boolean z11) {
        if (z11) {
            if (this.f34323p0.q3()) {
                u1(this, CreateEditAdvActionType.EDIT_LISTING_ADDON_SELECTED, str, false, 4, null);
            } else {
                t1(CreateEditAdvActionType.ADD_LISTING_ADDON_SELECTED, str, true);
            }
        } else if (this.f34323p0.q3()) {
            u1(this, CreateEditAdvActionType.EDIT_LISTING_ADDON_UNSELECTED, str, false, 4, null);
        } else {
            u1(this, CreateEditAdvActionType.ADD_LISTING_ADDON_UNSELECTED, str, false, 4, null);
        }
    }

    private final void z1() {
        if (this.f34323p0.q3()) {
            PostAdViewModel.J3(this.f34323p0, CreateEditAdvActionType.EDIT_ADDON_CONFIRM_PAYMENT_CLICKED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f34323p0, CreateEditAdvActionType.ADD_ADDON_CONFIRM_PAYMENT_CLICKED, null, null, null, null, 30, null);
        }
    }

    public final void A1() {
        if (this.f34323p0.q3()) {
            u1(this, CreateEditAdvActionType.EDIT_LISTING_FEATURES_VISITED, null, false, 6, null);
        } else {
            u1(this, CreateEditAdvActionType.ADD_LISTING_FEATURES_VISITED, null, false, 6, null);
        }
    }

    public final void C1(boolean z11) {
        this.f34333z0.postValue(Boolean.valueOf(z11));
    }

    public final void G1(Throwable throwable) {
        String g02;
        o.i(throwable, "throwable");
        if (throwable instanceof ResponseWrapper.ResponseErrorException) {
            g02 = ((ResponseWrapper.ResponseErrorException) throwable).getLocalizedMessage();
        } else {
            g02 = TypeExtensionsKt.g0(throwable);
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdAddonsViewModel$showError$1(this, g02, null), 3, null);
    }

    public final void H1(String message) {
        o.i(message, "message");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdAddonsViewModel$showTopAlert$1(this, message, null), 3, null);
    }

    public final void I1(boolean z11) {
        this.f34323p0.F4(z11);
    }

    public final boolean T0(int i11) {
        if (o.d(this.f34333z0.getValue(), Boolean.TRUE) && s1(i11)) {
            return true;
        }
        return false;
    }

    public final void U0() {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdAddonsViewModel$decideNextDestination$1(this, null), 3, null);
        z1();
    }

    public final LiveData<Integer> X0() {
        return this.K0;
    }

    public final SharedFlow<p> Y0() {
        return this.f34328u0;
    }

    public final void Z0() {
        this.f34323p0.l2();
    }

    public final Integer b1() {
        return this.f34326s0;
    }

    public final SharedFlow<p> c1() {
        return this.D0;
    }

    public final SharedFlow<p> d1() {
        return this.Q0;
    }

    public final PostAdViewModel e1() {
        return this.f34323p0;
    }

    public final SharedFlow<p> f1() {
        return this.B0;
    }

    public final b0<Boolean> g1() {
        return this.f34333z0;
    }

    public final SharedFlow<List<AddonsGroupItemViewModel>> i1() {
        return this.f34332y0;
    }

    public final SharedFlow<p> j1() {
        return this.M0;
    }

    public final SharedFlow<List<FeaturedAddonItemViewModel>> k1() {
        return this.f34330w0;
    }

    public final ji.b l1() {
        return this.E0;
    }

    public final SharedFlow<p> m1() {
        return this.O0;
    }

    public final void o1(ViewStates state, Integer num) {
        o.i(state, "state");
        String name = state.name();
        x10.a.e("XXX: goToState state " + name, new Object[0]);
        this.f34326s0 = num;
        v0().postValue(state);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
    }

    public final void q1() {
        w1();
        A1();
        C1(true);
    }

    public final boolean v1(int i11) {
        if (i11 != r0.I1) {
            return true;
        }
        return false;
    }

    public final void w1() {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new PostAdAddonsViewModel$prepareData$1(this, null), 2, null);
    }
}
