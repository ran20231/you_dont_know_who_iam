package com.forsale.app.features.categories.home;

import androidx.compose.runtime.c0;
import androidx.lifecycle.k0;
import ca.e;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import g00.p;
import j0.n1;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zz.a;
/* compiled from: MainCategoriesViewModel.kt */
/* loaded from: classes2.dex */
public final class MainCategoriesViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final k0 f23334k0;

    /* renamed from: l0  reason: collision with root package name */
    private final UserProfileInteractor f23335l0;

    /* renamed from: m0  reason: collision with root package name */
    private final BaseRepository f23336m0;

    /* renamed from: n0  reason: collision with root package name */
    private final Flow<String> f23337n0;

    /* renamed from: o0  reason: collision with root package name */
    private final j0.k0<List<CategoryEntity>> f23338o0;

    /* renamed from: p0  reason: collision with root package name */
    private final n1<List<CategoryEntity>> f23339p0;

    /* compiled from: MainCategoriesViewModel.kt */
    @d(c = "com.forsale.app.features.categories.home.MainCategoriesViewModel$1", f = "MainCategoriesViewModel.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.MainCategoriesViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f23346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainCategoriesViewModel f23347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, MainCategoriesViewModel mainCategoriesViewModel, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23346b = eVar;
            this.f23347c = mainCategoriesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f23346b, this.f23347c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f23345a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                e eVar = this.f23346b;
                this.f23345a = 1;
                obj = eVar.a(this);
                if (obj == f11) {
                    return f11;
                }
            }
            this.f23347c.f23338o0.setValue((List) obj);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesViewModel(k0 savedStateHandle, e verticalsInteractor, UserProfileInteractor userInteractor, BaseRepository baseRepository) {
        super(baseRepository);
        List n11;
        j0.k0<List<CategoryEntity>> e11;
        o.i(savedStateHandle, "savedStateHandle");
        o.i(verticalsInteractor, "verticalsInteractor");
        o.i(userInteractor, "userInteractor");
        o.i(baseRepository, "baseRepository");
        this.f23334k0 = savedStateHandle;
        this.f23335l0 = userInteractor;
        this.f23336m0 = baseRepository;
        final Flow<UserEntity> j11 = userInteractor.j();
        this.f23337n0 = new Flow<String>() { // from class: com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f23341a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1$2", f = "MainCategoriesViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f23342a;

                    /* renamed from: b  reason: collision with root package name */
                    int f23343b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f23342a = obj;
                        this.f23343b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f23341a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f23343b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f23343b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f23342a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f23343b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f23341a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        if (r5 == 0) goto L40
                        java.lang.String r5 = r5.getFirstName()
                        if (r5 != 0) goto L42
                    L40:
                        java.lang.String r5 = ""
                    L42:
                        r0.f23343b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.MainCategoriesViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return wz.p.f75480a;
            }
        };
        n11 = r.n();
        e11 = c0.e(n11, null, 2, null);
        this.f23338o0 = e11;
        this.f23339p0 = e11;
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(verticalsInteractor, this, null), 3, null);
    }
}
