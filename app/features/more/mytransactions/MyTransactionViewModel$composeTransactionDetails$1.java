package com.forsale.app.features.more.mytransactions;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyTransactionViewModel.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionViewModel$composeTransactionDetails$1", f = "MyTransactionViewModel.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyTransactionViewModel$composeTransactionDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31996a;

    /* renamed from: b  reason: collision with root package name */
    int f31997b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyTransactionViewModel f31998c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionViewModel$composeTransactionDetails$1(MyTransactionViewModel myTransactionViewModel, zz.a<? super MyTransactionViewModel$composeTransactionDetails$1> aVar) {
        super(2, aVar);
        this.f31998c = myTransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MyTransactionViewModel$composeTransactionDetails$1(this.f31998c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object v11;
        Float f12;
        ApplicationResourcesRepository applicationResourcesRepository;
        ForegroundColorSpan foregroundColorSpan;
        ApplicationResourcesRepository applicationResourcesRepository2;
        ForegroundColorSpan foregroundColorSpan2;
        String r11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31997b;
        if (i11 != 0) {
            if (i11 == 1) {
                f12 = (Float) this.f31996a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            Float amount = this.f31998c.m().getAmount();
            MyTransactionViewModel myTransactionViewModel = this.f31998c;
            this.f31996a = amount;
            this.f31997b = 1;
            v11 = myTransactionViewModel.v(this);
            if (v11 == f11) {
                return f11;
            }
            f12 = amount;
            obj = v11;
        }
        applicationResourcesRepository = this.f31998c.f31985b;
        String string = applicationResourcesRepository.getString(y0.f70723vb, new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f12 + " " + obj + " " + string + " ");
        foregroundColorSpan = this.f31998c.f31990g;
        MyTransactionViewModel myTransactionViewModel2 = this.f31998c;
        int length = spannableStringBuilder.length();
        TransactionType transactionType = myTransactionViewModel2.m().getTransactionType();
        if (transactionType != null) {
            r11 = myTransactionViewModel2.r(transactionType);
            spannableStringBuilder.append((CharSequence) (r11 + " "));
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        applicationResourcesRepository2 = this.f31998c.f31985b;
        String string2 = applicationResourcesRepository2.getString(y0.f70456fb, new Object[0]);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) (string2 + " "));
        o.h(append, "append(...)");
        foregroundColorSpan2 = this.f31998c.f31990g;
        MyTransactionViewModel myTransactionViewModel3 = this.f31998c;
        int length2 = append.length();
        append.append((CharSequence) myTransactionViewModel3.m().getSourceApp());
        append.setSpan(foregroundColorSpan2, length2, append.length(), 17);
        this.f31998c.o().k(append);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyTransactionViewModel$composeTransactionDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
