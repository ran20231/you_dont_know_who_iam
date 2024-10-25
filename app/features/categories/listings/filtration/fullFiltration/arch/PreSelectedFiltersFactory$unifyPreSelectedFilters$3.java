package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import cc.a;
import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreSelectedFiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$unifyPreSelectedFilters$3", f = "PreSelectedFiltersFactory.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory$unifyPreSelectedFilters$3 extends SuspendLambda implements p<List<a>, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29153a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f29154b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PreSelectedFiltersFactory f29155c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f29156d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSelectedFiltersFactory$unifyPreSelectedFilters$3(PreSelectedFiltersFactory preSelectedFiltersFactory, CategoryEntity categoryEntity, zz.a<? super PreSelectedFiltersFactory$unifyPreSelectedFilters$3> aVar) {
        super(2, aVar);
        this.f29155c = preSelectedFiltersFactory;
        this.f29156d = categoryEntity;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(List<a> list, zz.a<? super wz.p> aVar) {
        return ((PreSelectedFiltersFactory$unifyPreSelectedFilters$3) create(list, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PreSelectedFiltersFactory$unifyPreSelectedFilters$3 preSelectedFiltersFactory$unifyPreSelectedFilters$3 = new PreSelectedFiltersFactory$unifyPreSelectedFilters$3(this.f29155c, this.f29156d, aVar);
        preSelectedFiltersFactory$unifyPreSelectedFilters$3.f29154b = obj;
        return preSelectedFiltersFactory$unifyPreSelectedFilters$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object n11;
        f11 = b.f();
        int i11 = this.f29153a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PreSelectedFiltersFactory preSelectedFiltersFactory = this.f29155c;
            CategoryEntity categoryEntity = this.f29156d;
            this.f29153a = 1;
            n11 = preSelectedFiltersFactory.n((List) this.f29154b, categoryEntity, this);
            if (n11 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}
