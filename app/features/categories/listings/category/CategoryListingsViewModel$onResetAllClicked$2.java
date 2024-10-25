package com.forsale.app.features.categories.listings.category;

import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onResetAllClicked$2", f = "CategoryListingsViewModel.kt", l = {768, 769, 766, 775, 775}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$onResetAllClicked$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28563a;

    /* renamed from: b  reason: collision with root package name */
    Object f28564b;

    /* renamed from: c  reason: collision with root package name */
    Object f28565c;

    /* renamed from: d  reason: collision with root package name */
    int f28566d;

    /* renamed from: e  reason: collision with root package name */
    int f28567e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28568f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ListingsAnalytics$FiltersPlace f28569g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$onResetAllClicked$2(CategoryListingsViewModel categoryListingsViewModel, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, zz.a<? super CategoryListingsViewModel$onResetAllClicked$2> aVar) {
        super(2, aVar);
        this.f28568f = categoryListingsViewModel;
        this.f28569g = listingsAnalytics$FiltersPlace;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$onResetAllClicked$2(this.f28568f, this.f28569g, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
        if (r10 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:4:0x000e, B:16:0x0054], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bc -> B:32:0x00c4). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onResetAllClicked$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$onResetAllClicked$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
