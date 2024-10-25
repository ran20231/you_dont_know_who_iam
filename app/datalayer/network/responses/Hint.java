package com.forsale.app.datalayer.network.responses;

import a00.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.leanplum.internal.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import up.c;
import yj.d;
/* compiled from: AddonsResponse.kt */
/* loaded from: classes2.dex */
public final class Hint implements Parcelable {
    @c(Constants.Params.STATE)
    private final State state;
    @c("text")
    private final String text;
    public static final Parcelable.Creator<Hint> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: AddonsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<Hint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Hint createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new Hint(parcel.readString(), State.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Hint[] newArray(int i11) {
            return new Hint[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddonsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        private final String value;
        @c(com.adjust.sdk.Constants.NORMAL)
        public static final State Normal = new State("Normal", 0, com.adjust.sdk.Constants.NORMAL);
        @c(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
        public static final State Active = new State("Active", 1, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        @c("waiting")
        public static final State Waiting = new State("Waiting", 2, "waiting");
        @c("expired")
        public static final State Expired = new State("Expired", 3, "expired");

        /* compiled from: AddonsResponse.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[State.values().length];
                try {
                    iArr[State.Normal.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[State.Active.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[State.Waiting.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[State.Expired.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ State[] $values() {
            return new State[]{Normal, Active, Waiting, Expired};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private State(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        /* renamed from: getColor-WaAFU9c  reason: not valid java name */
        public final long m7getColorWaAFU9c(androidx.compose.runtime.a aVar, int i11) {
            long m11;
            aVar.C(-650308057);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-650308057, i11, -1, "com.forsale.app.datalayer.network.responses.Hint.State.getColor (AddonsResponse.kt:99)");
            }
            int i12 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        aVar.C(1010827345);
                        m11 = dk.a.f54291a.a(aVar, dk.a.f54292b).d().i(aVar, d.f76453b);
                        aVar.S();
                    } else {
                        aVar.C(1010824521);
                        aVar.S();
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    aVar.C(1010827277);
                    m11 = dk.a.f54291a.a(aVar, dk.a.f54292b).i().k(aVar, d.f76453b);
                    aVar.S();
                }
            } else {
                aVar.C(1010827207);
                m11 = dk.a.f54291a.a(aVar, dk.a.f54292b).e().m(aVar, d.f76453b);
                aVar.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return m11;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public Hint(String text, State state) {
        o.i(text, "text");
        o.i(state, "state");
        this.text = text;
        this.state = state;
    }

    public static /* synthetic */ Hint copy$default(Hint hint, String str, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hint.text;
        }
        if ((i11 & 2) != 0) {
            state = hint.state;
        }
        return hint.copy(str, state);
    }

    public final String component1() {
        return this.text;
    }

    public final State component2() {
        return this.state;
    }

    public final Hint copy(String text, State state) {
        o.i(text, "text");
        o.i(state, "state");
        return new Hint(text, state);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hint)) {
            return false;
        }
        Hint hint = (Hint) obj;
        if (o.d(this.text, hint.text) && this.state == hint.state) {
            return true;
        }
        return false;
    }

    public final State getState() {
        return this.state;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.state.hashCode();
    }

    public String toString() {
        String str = this.text;
        State state = this.state;
        return "Hint(text=" + str + ", state=" + state + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.text);
        out.writeString(this.state.name());
    }
}
