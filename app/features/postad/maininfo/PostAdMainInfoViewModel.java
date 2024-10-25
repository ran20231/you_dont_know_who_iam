package com.forsale.app.features.postad.maininfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository;
import com.forsale.app.features.postad.PostAdScreens;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.ErrorReason;
import com.forsale.app.utils.analytics.PLFSource;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.text.q;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import t9.y0;
import wz.p;
/* compiled from: PostAdMainInfoViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdMainInfoViewModel extends BaseViewModel {
    private final MutableSharedFlow<p> A0;
    private final SharedFlow<p> B0;
    private String C0;
    private final MutableSharedFlow<xe.b> D0;
    private final SharedFlow<xe.b> E0;

    /* renamed from: k0  reason: collision with root package name */
    private final ProhibitedKeywordsRepository f35862k0;

    /* renamed from: l0  reason: collision with root package name */
    private final DistrictsRepository f35863l0;

    /* renamed from: m0  reason: collision with root package name */
    private final PostAdViewModel f35864m0;

    /* renamed from: n0  reason: collision with root package name */
    private CategoryRuleSet.RuleSet f35865n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MutableSharedFlow<p> f35866o0;

    /* renamed from: p0  reason: collision with root package name */
    private final SharedFlow<p> f35867p0;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableSharedFlow<p> f35868q0;

    /* renamed from: r0  reason: collision with root package name */
    private final SharedFlow<p> f35869r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableSharedFlow<Pair<String, Boolean>> f35870s0;

    /* renamed from: t0  reason: collision with root package name */
    private final SharedFlow<Pair<String, Boolean>> f35871t0;

    /* renamed from: u0  reason: collision with root package name */
    private final LiveData<List<String>> f35872u0;

    /* renamed from: v0  reason: collision with root package name */
    private final b0<Boolean> f35873v0;

    /* renamed from: w0  reason: collision with root package name */
    private final b0<Boolean> f35874w0;

    /* renamed from: x0  reason: collision with root package name */
    private final b0<Boolean> f35875x0;

    /* renamed from: y0  reason: collision with root package name */
    private final MutableSharedFlow<p> f35876y0;

    /* renamed from: z0  reason: collision with root package name */
    private final SharedFlow<p> f35877z0;

    /* compiled from: PostAdMainInfoViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        PostAdMainInfoViewModel a(PostAdViewModel postAdViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoViewModel(ProhibitedKeywordsRepository prohibitedWordsRepo, DistrictsRepository districtRepo, PostAdViewModel postAdViewModel, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prohibitedWordsRepo, "prohibitedWordsRepo");
        o.i(districtRepo, "districtRepo");
        o.i(postAdViewModel, "postAdViewModel");
        o.i(baseRepository, "baseRepository");
        this.f35862k0 = prohibitedWordsRepo;
        this.f35863l0 = districtRepo;
        this.f35864m0 = postAdViewModel;
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35866o0 = MutableSharedFlow$default;
        this.f35867p0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35868q0 = MutableSharedFlow$default2;
        this.f35869r0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<Pair<String, Boolean>> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35870s0 = MutableSharedFlow$default3;
        this.f35871t0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        this.f35872u0 = new b0(prohibitedWordsRepo.getProhibtedKeyWordsLiveData());
        Boolean bool = Boolean.FALSE;
        this.f35873v0 = new b0<>(bool);
        this.f35874w0 = new b0<>(bool);
        this.f35875x0 = new b0<>(bool);
        MutableSharedFlow<p> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35876y0 = MutableSharedFlow$default4;
        this.f35877z0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<p> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.A0 = MutableSharedFlow$default5;
        this.B0 = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableSharedFlow<xe.b> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.D0 = MutableSharedFlow$default6;
        this.E0 = FlowKt.asSharedFlow(MutableSharedFlow$default6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0() {
        this.f35864m0.C3(AggregatedAllAnalyticsLogger.AdvActionEvents.ALERT_VIEWED, ErrorReason.CHANGE_CATEGORY.getValue(), this.f35864m0.S1(), this.f35864m0.W1().getValue());
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdMainInfoViewModel$changeCategoryAlert$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U0() {
        boolean z11;
        boolean z12;
        CategoryRuleSet.IntConfiguration price;
        CategoryRuleSet.IntConfiguration price2;
        CategoryRuleSet.RuleSet value = this.f35864m0.d2().getValue();
        if (value != null && (price2 = value.getPrice()) != null && price2.getEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            CategoryRuleSet.RuleSet value2 = this.f35864m0.d2().getValue();
            if (value2 != null && (price = value2.getPrice()) != null && price.getRequired()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1(String str) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdMainInfoViewModel$logChooseCategoryVisited$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1() {
        this.f35864m0.I4();
        this.f35864m0.N1(PostAdScreens.MAIN_INFO_SCREEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1() {
        if (this.f35864m0.q3()) {
            PostAdViewModel.J3(this.f35864m0, CreateEditAdvActionType.EDIT_MAIN_INFORMATION_NEXT_CLICKED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f35864m0, CreateEditAdvActionType.ADD_MAIN_INFORMATION_NEXT_CLICKED, null, null, null, null, 30, null);
        }
    }

    public final void I0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdMainInfoViewModel$changeCategory$1(this, null), 3, null);
    }

    public final SharedFlow<p> K0() {
        return this.f35867p0;
    }

    public final SharedFlow<p> L0() {
        return this.f35869r0;
    }

    public final SharedFlow<xe.b> M0() {
        return this.E0;
    }

    public final SharedFlow<Pair<String, Boolean>> N0() {
        return this.f35871t0;
    }

    public final PostAdViewModel O0() {
        return this.f35864m0;
    }

    public final LiveData<List<String>> P0() {
        return this.f35872u0;
    }

    public final SharedFlow<p> Q0() {
        return this.B0;
    }

    public final SharedFlow<p> R0() {
        return this.f35877z0;
    }

    public final String S0() {
        return this.C0;
    }

    public final b0<Boolean> T0() {
        return this.f35875x0;
    }

    public final b0<Boolean> V0() {
        return this.f35874w0;
    }

    public final b0<Boolean> W0() {
        return this.f35873v0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String X0(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Lc
            boolean r3 = kotlin.text.k.v(r3)
            if (r3 == 0) goto La
            goto Lc
        La:
            r3 = r0
            goto Ld
        Lc:
            r3 = 1
        Ld:
            if (r3 != 0) goto L11
            r3 = 0
            goto L1d
        L11:
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r3 = r2.J()
            int r1 = t9.y0.f70433e5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.getString(r1, r0)
        L1d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel.X0(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Y0(java.lang.String r3) {
        /*
            r2 = this;
            com.forsale.app.features.postad.PostAdViewModel r0 = r2.f35864m0
            androidx.lifecycle.z r0 = r0.o3()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.d(r0, r1)
            if (r0 == 0) goto L2e
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r3 = kotlin.text.k.v(r3)
            if (r3 == 0) goto L1c
            goto L1e
        L1c:
            r3 = r0
            goto L1f
        L1e:
            r3 = 1
        L1f:
            if (r3 == 0) goto L2e
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r3 = r2.J()
            int r1 = t9.y0.Ob
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.getString(r1, r0)
            goto L2f
        L2e:
            r3 = 0
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel.Y0(java.lang.String):java.lang.String");
    }

    public final String Z0(String priceField) {
        Double i11;
        CategoryRuleSet.IntConfiguration intConfiguration;
        boolean z11;
        boolean z12;
        o.i(priceField, "priceField");
        i11 = q.i(priceField);
        CategoryRuleSet.RuleSet value = this.f35864m0.d2().getValue();
        if (value != null) {
            intConfiguration = value.getPrice();
        } else {
            intConfiguration = null;
        }
        if (intConfiguration == null) {
            return J().getString(y0.f70433e5, new Object[0]);
        }
        if (!value.getPrice().getEnabled() || !value.getPrice().getRequired()) {
            return null;
        }
        if (priceField.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && i11 != null) {
            if (!value.getPrice().getRangeValidationRequired()) {
                return null;
            }
            float minValue = value.getPrice().getMinValue();
            float maxValue = value.getPrice().getMaxValue();
            float doubleValue = (float) i11.doubleValue();
            if (minValue <= doubleValue && doubleValue <= maxValue) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return null;
            }
            String format = String.format(J().getString(y0.f70382b5, new Object[0]), Arrays.copyOf(new Object[]{TypeExtensionsKt.p(value.getPrice().getMinValue()), TypeExtensionsKt.p(value.getPrice().getMaxValue())}, 2));
            o.h(format, "format(...)");
            return format;
        }
        return J().getString(y0.f70433e5, new Object[0]);
    }

    public final String b1(String titleField) {
        CategoryRuleSet.StringConfiguration stringConfiguration;
        boolean z11;
        boolean z12;
        String t02;
        o.i(titleField, "titleField");
        Set<String> prohibitedKeywordsIn = this.f35862k0.prohibitedKeywordsIn(titleField);
        CategoryRuleSet.RuleSet value = this.f35864m0.d2().getValue();
        if (value != null) {
            stringConfiguration = value.getTitle();
        } else {
            stringConfiguration = null;
        }
        if (stringConfiguration == null) {
            return J().getString(y0.f70433e5, new Object[0]);
        }
        if (titleField.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return J().getString(y0.f70433e5, new Object[0]);
        }
        Set<String> set = prohibitedKeywordsIn;
        if (set != null && !set.isEmpty()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12) {
            String string = J().getString(y0.f70416d5, new Object[0]);
            t02 = CollectionsKt___CollectionsKt.t0(prohibitedKeywordsIn, " , ", null, null, 0, null, null, 62, null);
            String format = String.format(string, Arrays.copyOf(new Object[]{t02}, 1));
            o.h(format, "format(...)");
            return format;
        } else if (titleField.length() < value.getTitle().getMinChars()) {
            String format2 = String.format(J().getString(y0.U4, new Object[0]), Arrays.copyOf(new Object[]{Integer.valueOf(value.getTitle().getMinChars())}, 1));
            o.h(format2, "format(...)");
            return format2;
        } else if (titleField.length() <= value.getTitle().getMaxChars()) {
            return null;
        } else {
            String format3 = String.format(J().getString(y0.T4, new Object[0]), Arrays.copyOf(new Object[]{Integer.valueOf(value.getTitle().getMaxChars())}, 1));
            o.h(format3, "format(...)");
            return format3;
        }
    }

    public final void e1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdMainInfoViewModel$onCategoryClicked$1(this, null), 3, null);
    }

    public final void f1() {
        c1(PLFSource.CHANGE_CATEGORY_ALERT.getValue());
        this.f35864m0.E1();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g1() {
        /*
            r7 = this;
            com.forsale.app.features.postad.PostAdViewModel r0 = r7.f35864m0
            androidx.lifecycle.LiveData r0 = r0.d2()
            java.lang.Object r0 = r0.getValue()
            com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet r0 = (com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5c
            com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r0 = r0.getLocationSettings()
            if (r0 == 0) goto L5c
            java.util.List r0 = r0.getLevels()
            if (r0 == 0) goto L5c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L2c
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2c
            goto L5c
        L2c:
            java.util.Iterator r0 = r0.iterator()
            r3 = r2
        L31:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r0.next()
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
            int r5 = r4.getLevel()
            com.forsale.app.features.postad.location.LocationLevels r6 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
            int r6 = r6.getLevel()
            if (r5 == r6) goto L51
            boolean r4 = r4.getEnabled()
            if (r4 == 0) goto L51
            r4 = r1
            goto L52
        L51:
            r4 = r2
        L52:
            if (r4 == 0) goto L31
            int r3 = r3 + 1
            if (r3 >= 0) goto L31
            kotlin.collections.p.w()
            goto L31
        L5c:
            r3 = r2
        L5d:
            com.forsale.app.features.postad.PostAdViewModel r0 = r7.f35864m0
            androidx.lifecycle.LiveData r0 = r0.d2()
            java.lang.Object r0 = r0.getValue()
            com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet r0 = (com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet) r0
            if (r0 == 0) goto La7
            com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r0 = r0.getLocationSettings()
            if (r0 == 0) goto La7
            com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r4 = r0.getLandmarks()
            if (r4 == 0) goto L7f
            boolean r4 = r4.getEnabled()
            if (r4 != r1) goto L7f
            r4 = r1
            goto L80
        L7f:
            r4 = r2
        L80:
            if (r4 != 0) goto La6
            com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r4 = r0.getMap()
            if (r4 == 0) goto L90
            boolean r4 = r4.getEnabled()
            if (r4 != r1) goto L90
            r4 = r1
            goto L91
        L90:
            r4 = r2
        L91:
            if (r4 != 0) goto La6
            com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r0 = r0.getStreet()
            if (r0 == 0) goto La1
            boolean r0 = r0.getEnabled()
            if (r0 != r1) goto La1
            r0 = r1
            goto La2
        La1:
            r0 = r2
        La2:
            if (r0 == 0) goto La5
            goto La6
        La5:
            r1 = r2
        La6:
            r2 = r1
        La7:
            r0 = 0
            if (r3 > 0) goto Lbb
            if (r2 == 0) goto Lad
            goto Lbb
        Lad:
            r1 = 0
            r2 = 0
            com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onDistrictClicked$2 r3 = new com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onDistrictClicked$2
            r3.<init>(r7, r0)
            r4 = 3
            r5 = 0
            r0 = r7
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            goto Lc8
        Lbb:
            r1 = 0
            r2 = 0
            com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onDistrictClicked$1 r3 = new com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onDistrictClicked$1
            r3.<init>(r7, r0)
            r4 = 3
            r5 = 0
            r0 = r7
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel.g1():void");
    }

    public final void h1(List<String> phonesList) {
        Object m02;
        o.i(phonesList, "phonesList");
        m02 = CollectionsKt___CollectionsKt.m0(phonesList);
        String str = (String) m02;
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdMainInfoViewModel$onPhoneDetected$1$1(this, str, null), 3, null);
        }
    }

    public final void i1(String newProhWord) {
        o.i(newProhWord, "newProhWord");
        this.f35864m0.y1(newProhWord);
    }

    public final void j1(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdMainInfoViewModel$onValidation$1(this, z11, null), 3, null);
    }

    public final void l1(CategoryRuleSet.RuleSet ruleSet) {
        boolean z11;
        boolean z12;
        CategoryEntity categoryEntity;
        CategoryRuleSet.IntConfiguration price;
        CategoryRuleSet.StringConfiguration title;
        b0<Boolean> b0Var = this.f35873v0;
        boolean z13 = false;
        if (ruleSet != null && (title = ruleSet.getTitle()) != null) {
            z11 = title.getEnabled();
        } else {
            z11 = false;
        }
        b0Var.postValue(Boolean.valueOf(z11));
        b0<Boolean> b0Var2 = this.f35874w0;
        if (ruleSet != null && (price = ruleSet.getPrice()) != null) {
            z12 = price.getEnabled();
        } else {
            z12 = false;
        }
        b0Var2.postValue(Boolean.valueOf(z12));
        b0<Boolean> b0Var3 = this.f35875x0;
        ListingDetailsEntity value = this.f35864m0.p2().getValue();
        if (value != null) {
            categoryEntity = value.getCategory();
        } else {
            categoryEntity = null;
        }
        if (categoryEntity != null) {
            Boolean value2 = this.f35873v0.getValue();
            Boolean bool = Boolean.TRUE;
            if (o.d(value2, bool) || o.d(this.f35874w0.getValue(), bool)) {
                z13 = true;
            }
        }
        b0Var3.postValue(Boolean.valueOf(z13));
        this.f35865n0 = ruleSet;
    }
}
