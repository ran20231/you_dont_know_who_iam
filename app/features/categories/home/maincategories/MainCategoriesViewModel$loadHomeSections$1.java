package com.forsale.app.features.categories.home.maincategories;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor;
import com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel;
import g00.p;
import j0.k0;
import java.util.Collection;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$loadHomeSections$1", f = "MainCategoriesViewModel.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainCategoriesViewModel$loadHomeSections$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24399a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainCategoriesViewModel f24400b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesViewModel$loadHomeSections$1(MainCategoriesViewModel mainCategoriesViewModel, zz.a<? super MainCategoriesViewModel$loadHomeSections$1> aVar) {
        super(2, aVar);
        this.f24400b = mainCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainCategoriesViewModel$loadHomeSections$1(this.f24400b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        k0 k0Var;
        GetHomeSectionsInteractor getHomeSectionsInteractor;
        SnapshotStateList snapshotStateList;
        SnapshotStateList snapshotStateList2;
        k0 k0Var2;
        MutableStateFlow mutableStateFlow;
        f11 = b.f();
        int i11 = this.f24399a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                getHomeSectionsInteractor = this.f24400b.f24371m0;
                this.f24399a = 1;
                obj = getHomeSectionsInteractor.l(this);
                if (obj == f11) {
                    return f11;
                }
            }
            Pair pair = (Pair) obj;
            this.f24400b.f24381w0 = (String) pair.d();
            snapshotStateList = this.f24400b.B0;
            snapshotStateList.clear();
            snapshotStateList2 = this.f24400b.B0;
            snapshotStateList2.addAll((Collection) pair.c());
            k0Var2 = this.f24400b.f24384z0;
            k0Var2.setValue(MainCategoriesViewModel.a.c.f24395a);
            mutableStateFlow = this.f24400b.I0;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.a.a(true));
        } catch (Exception e11) {
            k0Var = this.f24400b.f24384z0;
            k0Var.setValue(new MainCategoriesViewModel.a.C0269a(e11));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainCategoriesViewModel$loadHomeSections$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
