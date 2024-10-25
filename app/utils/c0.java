package com.forsale.app.utils;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TimerLiveData.kt */
/* loaded from: classes3.dex */
public final class c0 extends LiveData<Long> {

    /* renamed from: a  reason: collision with root package name */
    private final TimeUnit f40088a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<CountDownTimer> f40089b;

    /* compiled from: TimerLiveData.kt */
    /* loaded from: classes3.dex */
    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0 f40090a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, long j12, c0 c0Var) {
            super(j11, j12);
            this.f40090a = c0Var;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f40090a.setValue(0L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            c0 c0Var = this.f40090a;
            c0Var.setValue(Long.valueOf(c0Var.d().convert(j11, TimeUnit.MILLISECONDS)));
        }
    }

    public c0() {
        this(0L, 0L, null, 7, null);
    }

    public static /* synthetic */ void g(c0 c0Var, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        if ((i11 & 2) != 0) {
            j12 = 1000;
        }
        c0Var.f(j11, j12);
    }

    private final void h(long j11, long j12) {
        this.f40089b.set(new a(j11, j12, this).start());
    }

    public final void c() {
        CountDownTimer countDownTimer = this.f40089b.get();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final TimeUnit d() {
        return this.f40088a;
    }

    public final boolean e() {
        Long value;
        if (getValue() != null && (value = getValue()) != null && value.longValue() == 0) {
            return true;
        }
        return false;
    }

    public final void f(long j11, long j12) {
        c();
        h(j11, j12);
    }

    public /* synthetic */ c0(long j11, long j12, TimeUnit timeUnit, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 1000L : j12, (i11 & 4) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    public c0(long j11, long j12, TimeUnit outTimeUnit) {
        kotlin.jvm.internal.o.i(outTimeUnit, "outTimeUnit");
        this.f40088a = outTimeUnit;
        this.f40089b = new AtomicReference<>();
        h(j11, j12);
    }
}
