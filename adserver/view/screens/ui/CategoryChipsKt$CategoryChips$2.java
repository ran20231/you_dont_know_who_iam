package com.forsale.adserver.view.screens.ui;

import androidx.compose.foundation.lazy.LazyListState;
import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import g00.p;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CategoryChips.kt */
@d(c = "com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$2", f = "CategoryChips.kt", l = {l8.a.f62266c}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CategoryChipsKt$CategoryChips$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21503a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OffersViewModel.c f21504b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<n9.a> f21505c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LazyListState f21506d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryChipsKt$CategoryChips$2(OffersViewModel.c cVar, List<n9.a> list, LazyListState lazyListState, zz.a<? super CategoryChipsKt$CategoryChips$2> aVar) {
        super(2, aVar);
        this.f21504b = cVar;
        this.f21505c = list;
        this.f21506d = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryChipsKt$CategoryChips$2(this.f21504b, this.f21505c, this.f21506d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        int i11;
        boolean z11;
        f11 = b.f();
        int i12 = this.f21503a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            if ((this.f21504b instanceof OffersViewModel.c.a) && (!this.f21505c.isEmpty())) {
                LazyListState lazyListState = this.f21506d;
                List<n9.a> list = this.f21505c;
                OffersViewModel.c cVar = this.f21504b;
                Iterator<n9.a> it2 = list.iterator();
                int i13 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().a() == cVar.a()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i11 = i13;
                            break;
                        }
                        i13++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                this.f21503a = 1;
                if (LazyListState.k(lazyListState, i11, 0, this, 2, null) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryChipsKt$CategoryChips$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
