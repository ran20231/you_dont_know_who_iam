package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet;

import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.p;
/* compiled from: SelectableFilterDialog.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$onViewCreated$1", f = "SelectableFilterDialog.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectableFilterDialog$onViewCreated$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30025a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SelectableFilterDialog f30026b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectableFilterDialog.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$onViewCreated$1$1", f = "SelectableFilterDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<SelectableFilterViewModel.a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f30027a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f30028b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SelectableFilterDialog f30029c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SelectableFilterDialog selectableFilterDialog, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f30029c = selectableFilterDialog;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(SelectableFilterViewModel.a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f30029c, aVar);
            anonymousClass1.f30028b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l lVar;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f30027a == 0) {
                f.b(obj);
                SelectableFilterViewModel.a aVar = (SelectableFilterViewModel.a) this.f30028b;
                if (aVar instanceof SelectableFilterViewModel.a.C0334a) {
                    lVar = this.f30029c.f29955f;
                    if (lVar != null) {
                        lVar.invoke(((SelectableFilterViewModel.a.C0334a) aVar).a());
                    }
                    this.f30029c.dismiss();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableFilterDialog$onViewCreated$1(SelectableFilterDialog selectableFilterDialog, zz.a<? super SelectableFilterDialog$onViewCreated$1> aVar) {
        super(1, aVar);
        this.f30026b = selectableFilterDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SelectableFilterDialog$onViewCreated$1(this.f30026b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30025a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<SelectableFilterViewModel.a> B0 = this.f30026b.T().B0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f30026b, null);
            this.f30025a = 1;
            if (FlowKt.collectLatest(B0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SelectableFilterDialog$onViewCreated$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
