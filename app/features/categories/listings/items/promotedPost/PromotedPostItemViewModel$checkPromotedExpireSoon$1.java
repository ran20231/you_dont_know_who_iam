package com.forsale.app.features.categories.listings.items.promotedPost;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PromotedPostItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$checkPromotedExpireSoon$1", f = "PromotedPostItemViewModel.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PromotedPostItemViewModel$checkPromotedExpireSoon$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f30884a;

    /* renamed from: b  reason: collision with root package name */
    int f30885b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PromotedPostItemViewModel f30886c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InAppMessageEntity f30887d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItemViewModel$checkPromotedExpireSoon$1(PromotedPostItemViewModel promotedPostItemViewModel, InAppMessageEntity inAppMessageEntity, zz.a<? super PromotedPostItemViewModel$checkPromotedExpireSoon$1> aVar) {
        super(2, aVar);
        this.f30886c = promotedPostItemViewModel;
        this.f30887d = inAppMessageEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PromotedPostItemViewModel$checkPromotedExpireSoon$1(this.f30886c, this.f30887d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b0 b0Var;
        g00.a aVar;
        PromotedPostItemViewModel promotedPostItemViewModel;
        OneShotEventHandler oneShotEventHandler;
        MutableStateFlow mutableStateFlow;
        PromotedPostItemViewModel promotedPostItemViewModel2;
        f11 = b.f();
        int i11 = this.f30885b;
        if (i11 != 0) {
            if (i11 == 1) {
                promotedPostItemViewModel2 = (PromotedPostItemViewModel) this.f30884a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            b0Var = this.f30886c.C;
            if (!o.d(b0Var.getValue(), kotlin.coroutines.jvm.internal.a.a(false))) {
                aVar = this.f30886c.f30875x;
                aVar.invoke();
            } else {
                InAppMessageEntity inAppMessageEntity = this.f30887d;
                if (inAppMessageEntity == null) {
                    inAppMessageEntity = this.f30886c.G();
                }
                if (inAppMessageEntity != null) {
                    promotedPostItemViewModel = this.f30886c;
                    String text = inAppMessageEntity.getText();
                    x10.a.b("PROMOTED: checkPromotedExpireSoon2 " + text, new Object[0]);
                    oneShotEventHandler = promotedPostItemViewModel.f30873i;
                    if (oneShotEventHandler != null) {
                        oneShotEventHandler.i(wz.p.f75480a);
                    }
                    mutableStateFlow = promotedPostItemViewModel.f30876y;
                    if (mutableStateFlow != null) {
                        PromotedPostItemViewModel.PromotedPostState promotedPostState = PromotedPostItemViewModel.PromotedPostState.SHOWN;
                        this.f30884a = promotedPostItemViewModel;
                        this.f30885b = 1;
                        if (mutableStateFlow.emit(promotedPostState, this) == f11) {
                            return f11;
                        }
                        promotedPostItemViewModel2 = promotedPostItemViewModel;
                    }
                    promotedPostItemViewModel.L();
                }
            }
            return wz.p.f75480a;
        }
        promotedPostItemViewModel = promotedPostItemViewModel2;
        promotedPostItemViewModel.L();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PromotedPostItemViewModel$checkPromotedExpireSoon$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
