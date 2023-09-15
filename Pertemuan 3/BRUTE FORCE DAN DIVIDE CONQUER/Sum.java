public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    Sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double [elemen];
        this.total = 0;
    }

    String totalBF(double arr[], int decimalPlaces) {
        double result = 0;
        for (int i = 0; i < elemen; i++) {
            result += arr[i];
        }
        String formattedResult = String.format("%." + decimalPlaces + "f", result);
        return formattedResult;
    }

    String totalDC(double arr[], int l, int r, int decimalPlaces) {
        if (l == r)
            return String.format("%." + decimalPlaces + "f", arr[l]);
        else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = Double.parseDouble(totalDC(arr, l, mid - 1, decimalPlaces));
            double rsum = Double.parseDouble(totalDC(arr, mid + 1, r, decimalPlaces));
            double sum = lsum + rsum + arr[mid];
            String formattedResult = String.format("%." + decimalPlaces + "f", sum);
            return formattedResult;
        }
        return "0";
    }
}