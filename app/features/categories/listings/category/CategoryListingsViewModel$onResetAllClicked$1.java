package com.forsale.app.features.categories.listings.category;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onResetAllClicked$1", f = "CategoryListingsViewModel.kt", l = {751, 752, 749}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$onResetAllClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28556a;

    /* renamed from: b  reason: collision with root package name */
    Object f28557b;

    /* renamed from: c  reason: collision with root package name */
    Object f28558c;

    /* renamed from: d  reason: collision with root package name */
    int f28559d;

    /* renamed from: e  reason: collision with root package name */
    int f28560e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28561f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f28562g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$onResetAllClicked$1(CategoryListingsViewModel categoryListingsViewModel, g00.a<wz.p> aVar, zz.a<? super CategoryListingsViewModel$onResetAllClicked$1> aVar2) {
        super(2, aVar2);
        this.f28561f = categoryListingsViewModel;
        this.f28562g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$onResetAllClicked$1(this.f28561f, this.f28562g, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
        if (r8 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:4:0x000c, B:12:0x0042], limit reached: 42 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00aa -> B:28:0x00b2). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onResetAllClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$onResetAllClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
