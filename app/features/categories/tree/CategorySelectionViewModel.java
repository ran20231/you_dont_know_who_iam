package com.forsale.app.features.categories.tree;

import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kr.m;
/* compiled from: CategorySelectionViewModel.kt */
/* loaded from: classes2.dex */
public final class CategorySelectionViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final boolean f31116l0;

    /* renamed from: m0  reason: collision with root package name */
    private final CategoryDao f31117m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableField<List<CategoryEntity>> f31118n0;

    /* renamed from: o0  reason: collision with root package name */
    private final b0<ArrayList<m<?>>> f31119o0;

    /* renamed from: p0  reason: collision with root package name */
    private final LiveData<ArrayList<m<?>>> f31120p0;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableSharedFlow<CategoryEntity> f31121q0;

    /* renamed from: r0  reason: collision with root package name */
    private final SharedFlow<CategoryEntity> f31122r0;

    /* compiled from: CategorySelectionViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        CategorySelectionViewModel a(boolean z11);
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((CategoryEntity) t11).getDisplayOrder()), Integer.valueOf(((CategoryEntity) t12).getDisplayOrder()));
            return a11;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((CategoryEntity) t11).getDisplayOrder()), Integer.valueOf(((CategoryEntity) t12).getDisplayOrder()));
            return a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorySelectionViewModel(boolean z11, CategoryDao categoryDao, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(categoryDao, "categoryDao");
        o.i(baseRepository, "baseRepository");
        this.f31116l0 = z11;
        this.f31117m0 = categoryDao;
        this.f31118n0 = new ObservableField<>();
        b0<ArrayList<m<?>>> b0Var = new b0<>();
        this.f31119o0 = b0Var;
        this.f31120p0 = b0Var;
        MutableSharedFlow<CategoryEntity> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f31121q0 = MutableSharedFlow$default;
        this.f31122r0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<kr.m<?>> A0() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 1
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            androidx.databinding.ObservableField<java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> r2 = r7.f31118n0
            java.lang.Object r2 = r2.j()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L51
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            g00.l r3 = r7.G0()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r2.next()
            java.lang.Object r6 = r3.invoke(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L25
            r4.add(r5)
            goto L25
        L3f:
            com.forsale.app.features.categories.tree.CategorySelectionViewModel$b r2 = new com.forsale.app.features.categories.tree.CategorySelectionViewModel$b
            r2.<init>()
            java.util.List r2 = kotlin.collections.p.M0(r4, r2)
            if (r2 == 0) goto L51
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.p.X0(r2)
            goto L52
        L51:
            r2 = 0
        L52:
            if (r2 == 0) goto L6f
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L5a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r2.next()
            com.forsale.app.datalayer.database.CategoryEntity r3 = (com.forsale.app.datalayer.database.CategoryEntity) r3
            r4 = 0
            jd.c r3 = r7.B0(r3, r4, r0)
            r1.add(r3)
            goto L5a
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.tree.CategorySelectionViewModel.A0():java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final jd.c B0(com.forsale.app.datalayer.database.CategoryEntity r10, int r11, java.util.concurrent.atomic.AtomicLong r12) {
        /*
            r9 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            androidx.databinding.ObservableField<java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> r1 = r9.f31118n0
            java.lang.Object r1 = r1.j()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L4e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r2 = r10.getId()
            g00.l r2 = r9.H0(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r1.next()
            java.lang.Object r5 = r2.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L22
            r3.add(r4)
            goto L22
        L3c:
            com.forsale.app.features.categories.tree.CategorySelectionViewModel$c r1 = new com.forsale.app.features.categories.tree.CategorySelectionViewModel$c
            r1.<init>()
            java.util.List r1 = kotlin.collections.p.M0(r3, r1)
            if (r1 == 0) goto L4e
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = kotlin.collections.p.a1(r1)
            goto L4f
        L4e:
            r1 = 0
        L4f:
            int r5 = r11 + 1
            if (r1 == 0) goto L6e
            r11 = r1
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L5a:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r11.next()
            com.forsale.app.datalayer.database.CategoryEntity r2 = (com.forsale.app.datalayer.database.CategoryEntity) r2
            jd.c r2 = r9.B0(r2, r5, r12)
            r0.add(r2)
            goto L5a
        L6e:
            jd.c r11 = new jd.c
            com.forsale.app.features.categories.tree.CategorySelectionItemViewModel r8 = new com.forsale.app.features.categories.tree.CategorySelectionItemViewModel
            kotlinx.coroutines.CoroutineScope r3 = androidx.lifecycle.r0.a(r9)
            if (r1 == 0) goto L7d
            boolean r1 = r1.isEmpty()
            goto L7e
        L7d:
            r1 = 0
        L7e:
            r6 = r1
            kotlinx.coroutines.flow.MutableSharedFlow<com.forsale.app.datalayer.database.CategoryEntity> r7 = r9.f31121q0
            r2 = r8
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r11.<init>(r8)
            long r1 = r12.getAndIncrement()
            r11.o(r1)
            java.util.List r10 = r11.l()
            r10.addAll(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.tree.CategorySelectionViewModel.B0(com.forsale.app.datalayer.database.CategoryEntity, int, java.util.concurrent.atomic.AtomicLong):jd.c");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C0(int i11, zz.a<? super List<CategoryEntity>> aVar) {
        return this.f31117m0.getAllCategoriesAsList(i11, aVar);
    }

    private final l<CategoryEntity, Boolean> G0() {
        if (this.f31116l0) {
            return new l<CategoryEntity, Boolean>() { // from class: com.forsale.app.features.categories.tree.CategorySelectionViewModel$getFilterParentCategoryPredicate$1
                @Override // g00.l
                /* renamed from: b */
                public final Boolean invoke(CategoryEntity it2) {
                    boolean z11;
                    o.i(it2, "it");
                    if (it2.getParentId() == 0 && TypeExtensionsKt.h0(it2.getAllowUploading())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
            };
        }
        return new l<CategoryEntity, Boolean>() { // from class: com.forsale.app.features.categories.tree.CategorySelectionViewModel$getFilterParentCategoryPredicate$2
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(CategoryEntity it2) {
                boolean z11;
                o.i(it2, "it");
                if (it2.getParentId() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        };
    }

    private final l<CategoryEntity, Boolean> H0(final int i11) {
        if (this.f31116l0) {
            return new l<CategoryEntity, Boolean>() { // from class: com.forsale.app.features.categories.tree.CategorySelectionViewModel$getFilterSubCategoryPredicate$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // g00.l
                /* renamed from: b */
                public final Boolean invoke(CategoryEntity it2) {
                    boolean z11;
                    o.i(it2, "it");
                    if (it2.getParentId() == i11 && TypeExtensionsKt.h0(it2.getAllowUploading())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
            };
        }
        return new l<CategoryEntity, Boolean>() { // from class: com.forsale.app.features.categories.tree.CategorySelectionViewModel$getFilterSubCategoryPredicate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(CategoryEntity it2) {
                boolean z11;
                o.i(it2, "it");
                if (it2.getParentId() == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        };
    }

    private final void I0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CategorySelectionViewModel$loadCategoriesTree$1(this, null), 3, null);
    }

    public final LiveData<ArrayList<m<?>>> D0() {
        return this.f31120p0;
    }

    public final SharedFlow<CategoryEntity> E0() {
        return this.f31122r0;
    }
}
