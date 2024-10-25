package com.forsale.app.features.more.wanteditems;

import android.view.View;
import androidx.databinding.ObservableField;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import falcon.chat.entities.ExtensionsKt;
import g00.p;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
/* compiled from: WantedItemViewModel.kt */
/* loaded from: classes2.dex */
public final class WantedItemViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final ItemSubscriptionResponse f33716k0;

    /* renamed from: l0  reason: collision with root package name */
    private final CategoryDao f33717l0;

    /* renamed from: m0  reason: collision with root package name */
    private final DistrictsRepository f33718m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ApplicationResourcesRepository f33719n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ObservableField<String> f33720o0;

    /* renamed from: p0  reason: collision with root package name */
    private final ObservableField<String> f33721p0;

    /* renamed from: q0  reason: collision with root package name */
    private final ObservableField<String> f33722q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<ItemSubscriptionResponse> f33723r0;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<ItemSubscriptionResponse> f33724s0;

    /* renamed from: t0  reason: collision with root package name */
    private final b0<String> f33725t0;

    /* compiled from: WantedItemViewModel.kt */
    @d(c = "com.forsale.app.features.more.wanteditems.WantedItemViewModel$1", f = "WantedItemViewModel.kt", l = {50, 57, 58}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.wanteditems.WantedItemViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f33726a;

        /* renamed from: b  reason: collision with root package name */
        Object f33727b;

        /* renamed from: c  reason: collision with root package name */
        Object f33728c;

        /* renamed from: d  reason: collision with root package name */
        int f33729d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f33730e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WantedItemViewModel.kt */
        @d(c = "com.forsale.app.features.more.wanteditems.WantedItemViewModel$1$4", f = "WantedItemViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.more.wanteditems.WantedItemViewModel$1$4  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass4 extends SuspendLambda implements p<List<? extends String>, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f33732a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f33733b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ WantedItemViewModel f33734c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(WantedItemViewModel wantedItemViewModel, zz.a<? super AnonymousClass4> aVar) {
                super(2, aVar);
                this.f33734c = wantedItemViewModel;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(List<String> list, zz.a<? super wz.p> aVar) {
                return ((AnonymousClass4) create(list, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f33734c, aVar);
                anonymousClass4.f33733b = obj;
                return anonymousClass4;
            }

            /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ?? k02;
                String t02;
                b.f();
                if (this.f33732a == 0) {
                    f.b(obj);
                    List list = (List) this.f33733b;
                    if (list.size() > 1) {
                        b0<String> C0 = this.f33734c.C0();
                        t02 = CollectionsKt___CollectionsKt.t0(list, " , ", null, null, 0, null, null, 62, null);
                        C0.postValue(t02);
                    } else if (list.size() == 1) {
                        b0<String> C02 = this.f33734c.C0();
                        k02 = CollectionsKt___CollectionsKt.k0(list);
                        C02.postValue(k02);
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar);
            anonymousClass1.f33730e = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
        /* JADX WARN: Type inference failed for: r1v19, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e3 -> B:31:0x00ea). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.wanteditems.WantedItemViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WantedItemViewModel f33735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, WantedItemViewModel wantedItemViewModel) {
            super(key);
            this.f33735a = wantedItemViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this.f33735a), null, null, new WantedItemViewModel$coroutineContext$1$1(this.f33735a, th2, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemViewModel(ItemSubscriptionResponse item, CategoryDao categoryDao, DistrictsRepository districtRepo, ApplicationResourcesRepository resourcesRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(item, "item");
        o.i(categoryDao, "categoryDao");
        o.i(districtRepo, "districtRepo");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(baseRepository, "baseRepository");
        this.f33716k0 = item;
        this.f33717l0 = categoryDao;
        this.f33718m0 = districtRepo;
        this.f33719n0 = resourcesRepository;
        this.f33720o0 = new ObservableField<>();
        this.f33721p0 = new ObservableField<>();
        ObservableField<String> observableField = new ObservableField<>();
        this.f33722q0 = observableField;
        this.f33723r0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f33724s0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f33725t0 = new b0<>();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
        String string = resourcesRepository.getString(y0.Z3, new Object[0]);
        String J0 = TypeExtensionsKt.J0(item.getEndDate());
        observableField.k(string + " " + J0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E0() {
        if (this.f33716k0.isAdvancedSearch() && ExtensionsKt.isNullOrEmpty(this.f33716k0.getSusbscriptionTxt()) && this.f33716k0.getCategoryId() != null) {
            String string = this.f33719n0.getString(y0.f70494hf, new Object[0]);
            String j11 = this.f33720o0.j();
            return string + " " + ((Object) j11);
        } else if (!ExtensionsKt.isNullOrEmpty(this.f33716k0.getSusbscriptionTxt()) && this.f33716k0.getCategoryId() != null) {
            String susbscriptionTxt = this.f33716k0.getSusbscriptionTxt();
            String string2 = this.f33719n0.getString(y0.Cd, new Object[0]);
            String j12 = this.f33720o0.j();
            return susbscriptionTxt + " " + string2 + " " + ((Object) j12);
        } else if (ExtensionsKt.isNullOrEmpty(this.f33716k0.getSusbscriptionTxt())) {
            String string3 = this.f33719n0.getString(y0.Dd, new Object[0]);
            String j13 = this.f33720o0.j();
            return string3 + " " + ((Object) j13);
        } else {
            String susbscriptionTxt2 = this.f33716k0.getSusbscriptionTxt();
            String string4 = this.f33719n0.getString(y0.Bd, new Object[0]);
            return susbscriptionTxt2 + " " + string4;
        }
    }

    public final boolean A0(View view) {
        o.i(view, "view");
        this.f33724s0.i(this.f33716k0);
        return false;
    }

    public final OneShotEventHandler<ItemSubscriptionResponse> B0() {
        return this.f33724s0;
    }

    public final b0<String> C0() {
        return this.f33725t0;
    }

    public final OneShotEventHandler<ItemSubscriptionResponse> D0() {
        return this.f33723r0;
    }

    public final ObservableField<String> G0() {
        return this.f33722q0;
    }

    public final ObservableField<String> H0() {
        return this.f33721p0;
    }

    public final void I0() {
        this.f33723r0.i(this.f33716k0);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new a(CoroutineExceptionHandler.Key, this));
    }
}
